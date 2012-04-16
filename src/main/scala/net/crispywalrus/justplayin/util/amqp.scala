package net.crispywalrus.justplayin.util

import akka.amqp.AMQP.ConnectionParameters
import akka.amqp.rpc.RPC
import com.rabbitmq.client.Address

object AMQPUtils {

  def parseUrl(s:String) : ConnectionParameters = {
    val url      = new java.net.URI(s)
    val defaults = ConnectionParameters()
    
    val params = ConnectionParameters()
    params
  }

  def main(args:Array[String]) {
    val s1   = "amqp://bob:robert@xyzzy.google.com/foobar"
    val s2   = "mailto:bob.google.com"
    var url = new java.net.URI(s1);
    println("******")
    println("** { "+url.getScheme()+","+url.getSchemeSpecificPart()+","+url.getAuthority()+","+url.getHost()+","+url.getPort()+","+url.getPath())
    println("******")
    url = new java.net.URI(s2);
    println("** { "+url.getScheme()+","+url.getSchemeSpecificPart()+","+url.getAuthority()+","+url.getHost()+","+url.getPort()+","+url.getPath())
    println("******")
  }

}
