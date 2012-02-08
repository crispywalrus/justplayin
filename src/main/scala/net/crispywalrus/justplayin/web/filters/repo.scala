package net.crispywalrus.justplayin.web.filter

import unfiltered.request._
import unfiltered.response._

class EntityRepository extends unfiltered.filter.Plan {

  val logger = grizzled.slf4j.Logger(classOf[EntityRepository])

  val fetchRequests =  unfiltered.filter.Intent {
    case GET(req) => req match {
      case Path(Seg("repo" :: steps )) => 
        logger.debug("got back a repo request for entity "+steps)
        Ok ~> ResponseString("entity id: "+steps+", with requestURI: "+req.underlying.getRequestURI())
      case _ => Pass
    }
  }

  def intent = fetchRequests

}
