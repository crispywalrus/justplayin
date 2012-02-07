package net.crispywalrus.justplayin.domain

import org.squeryl.KeyedEntity
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema
import org.squeryl.annotations.Column

class DomainModel extends KeyedEntity[Long] {
  val id: Long = 0
  @Column("created_at") 
  val createdAt = new java.sql.Timestamp(System.currentTimeMillis) 
  @Column("updated_at") 
  var updatedAt = new java.sql.Timestamp(System.currentTimeMillis)
}

case class User(firstName:String,lastName:String,handle:String,email:String) extends DomainModel {
  def this(email:String,handle:String) = this("","",handle,email)
}

object schema extends Schema {

  val users = table[User]

  on(users)(user => declare(
    user.id is (autoIncremented),
    user.email is (unique),
    user.handle is (unique)
  ))
}
