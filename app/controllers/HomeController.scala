package controllers

import akka.stream.scaladsl.Sink.collection
import controllers.Helpers
import controllers.Helpers._

import javax.inject._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import play.api.libs.json._
import reactivemongo.api.{Cursor, ReadPreference}
import reactivemongo.play.json.collection.Helpers.idWrites
import reactivemongo.play.json.collection.JSONCollection

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject() (cc: ControllerComponents, val reactiveMongoApi: ReactiveMongoApi) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents {

  implicit def ec: ExecutionContext = cc.executionContext

  def collection: Future[JSONCollection] =
    database.map(_.collection[JSONCollection]("names"))


  def create = Action.async {
    println("attempting to create name")
    val json = Json.obj("name" -> "pnus")

    this.collection.flatMap(_.insert.one(json)).map(lastError =>
        Ok("Mongo LastError: %s".format(lastError))
    )
  }

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    Ok(views.html.index("aaaa"))
  }
}
