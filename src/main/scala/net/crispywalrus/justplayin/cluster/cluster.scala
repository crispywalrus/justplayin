package net.crispywalrus.justplayin.cluster

trait Destination
trait Channel

trait ResultsNotifier[T] {

  def cancelled:Unit
  def failed:Unit
  def results(t:T):Unit
  def interrupted:Unit

}

trait Dispatcher[D<:Destination] {
  def start:Unit
  def stop:Unit
  def send(dest:D,msg:Array[Byte]):Unit
  def send(dests:Array[D],msg:Array[Byte])
}

