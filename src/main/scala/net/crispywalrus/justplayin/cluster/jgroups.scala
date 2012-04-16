package net.crispywalrus.justplayin.cluster

import org.jgroups.{Address,JChannel,Message,MessageListener,MembershipListener}
import org.jgroups.blocks._
import org.jgroups.blocks.RequestOptions._
import org.jgroups.stack.ProtocolStack
import org.jgroups.util.FutureListener

trait Protocol[C<:Channel] {
  def addProtocol(channel:C):C
}

trait FutureListenerResultsNotifier[T] extends ResultsNotifier[T] {

  def futureDone(future:java.util.concurrent.Future[T]):Unit = {
    try {
      results(future.get)
    }
    catch {
      case ex:java.util.concurrent.CancellationException => cancelled
      case ex:java.util.concurrent.ExecutionException => failed
      case ex:InterruptedException => interrupted
    }
  }
}

trait ResultsOrientedResultsNotifier[T] extends FutureListenerResultsNotifier[T] {
  def interrupted: Unit = {}
  def cancelled: Unit = {}
  def failed: Unit = {}
}

class JGroupsDestination(val addr:Address) extends Destination

class JChannelChannel(val name:String,val stack:ProtocolStack) extends Channel {
  def channel = new JChannel(false)
  channel.setName(name)
  channel.setProtocolStack(stack)
}

trait JGroupsArrayDispatcher[D<:JGroupsDestination] extends Dispatcher[D] {
  def send(dests:D,msg:Array[Byte]):Unit
  def send(dests:Array[D],msg:Array[Byte]):Unit = dests.foreach(d => send(d,msg))
}

class JGroupDispatcher(val name:String,
                       val messageListener:MessageListener,
                       val membershipListener:MembershipListener=null,
                       val requestHandler:RequestHandler=null) extends Dispatcher[JGroupsDestination] with JGroupsArrayDispatcher[JGroupsDestination] {

  private var channel:JChannel = null 
  private val dispatcher:MessageDispatcher = new MessageDispatcher

  def start():Unit = {
    channel = new JChannel
    channel.setName(name)
    dispatcher.setChannel(channel)
    dispatcher.setMessageListener(messageListener)
    if( membershipListener != null ) dispatcher.setMembershipListener(membershipListener)
    if( requestHandler != null ) dispatcher.setRequestHandler(requestHandler)
    dispatcher.start
  }

  def stop:Unit = { 
    dispatcher.stop
    channel.close
    channel = null
  }

  def send(dest:JGroupsDestination,msg:Array[Byte]):Unit = {
    val jmsg:Message = new Message(dest.addr,msg)
    dispatcher.sendMessage(jmsg,ASYNC)
  }

}
