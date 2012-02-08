package net.crispywalrus.justplayin.app

import akka.util.AkkaLoader
import akka.actor.BootableActorLoaderService
import javax.servlet.{ServletContextListener, ServletContextEvent}

 /**
  * This class is created and invoked via a listener in web.xml to
  * start and postStop Akka.
  *
  * @author crispy
  */
class Boot extends ServletContextListener {

  lazy val loader = new AkkaLoader

  def contextDestroyed(e: ServletContextEvent): Unit = loader.shutdown

  def contextInitialized(e: ServletContextEvent): Unit =
    loader.boot(true, new BootableActorLoaderService {}) 
}
