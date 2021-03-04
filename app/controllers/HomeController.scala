package controllers

import controllers.Helpers
import controllers.Helpers._

import javax.inject._
import play.api.mvc._
import org.mongodb.scala._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    val uri: String = "mongodb+srv://m001-student:m001-mongodb-basics@sandbox.nveej.mongodb.net/sample_analytics?retryWrites=true&w=majority"
    System.setProperty("org.mongodb.async.type", "netty")
    val client: MongoClient = MongoClient(uri)
    val db: MongoDatabase = client.getDatabase("sample_analytics")
    val coll: MongoCollection[Document] = db.getCollection("customers")
    //coll.find().printResults()
    Ok(views.html.index("aaaa"))
  }

}
