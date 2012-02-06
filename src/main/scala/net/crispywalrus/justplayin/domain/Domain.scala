package net.crispywalrus.justplayin.domain

import org.squeryl.KeyedEntity
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema
import org.squeryl.annotations.Column

case class User(id:Long,firstName:String,lastName:String,handle:String,email:String) extends KeyedEntity[Long]

object schema extends Schema {

  val users = table[User]

}
