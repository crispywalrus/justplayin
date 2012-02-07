package net.crispywalrus.justplayin.domain

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Session
import org.squeryl.SessionFactory
import org.squeryl.adapters._
import org.squeryl.internals.DatabaseAdapter
import net.crispywalrus.justplayin.domain._


object Dmain {

  def main(args: Array[String]) {
    createDbSession("jdbc:mysql://localhost:3306/justplayindb?user=liqui&password=base",new MySQLInnoDBAdapter)

    transaction {
      schema.create
    }

    inTransaction {
      try {
        val user:User = new User("crispywalrus@gmail.com","crispy")
        schema.users.insert(user)
      } catch {
        case e:RuntimeException => {
          println("bogosity: "+e.getCause())
          println("bogosity: "+e.getMessage())
        }
      }
    }
    
    println("done "+readLine())
  }

  def createDbSession(dbUrl:String,adapter:DatabaseAdapter): Unit = {
    Class.forName("com.mysql.jdbc.Driver")
    SessionFactory.concreteFactory = Some(() => Session.create(java.sql.DriverManager.getConnection(dbUrl),adapter))
  }

}
