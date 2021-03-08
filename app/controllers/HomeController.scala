package controllers

import akka.stream.scaladsl.Sink.collection
import controllers.Helpers
import controllers.Helpers._
import models._

import javax.inject._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.api.{Cursor, MongoConnectionOptions, ReadPreference}
import reactivemongo.play.json.collection.Helpers.idWrites
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.json._
import reactivemongo.play.json._

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject() (cc: ControllerComponents, val reactiveMongoApi: ReactiveMongoApi) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents {

  implicit def ec: ExecutionContext = cc.executionContext

  def userCollection: Future[JSONCollection] =
    database.map(_.collection[JSONCollection]("users"))

  def create = Action.async {
    val user = User(22, "Simon", "Forster", List(Feed("Some page", "https://www.google.com")))
    userCollection.flatMap(_.insert.one(user)).map(_ =>
      Ok
    )
  }



  def update = ???

  def delete = ???

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    Ok(views.html.index("aaaa"))
  }

}
