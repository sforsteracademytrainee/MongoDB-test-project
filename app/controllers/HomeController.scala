package controllers

import controllers.Helpers
import controllers.Helpers._

import javax.inject._
import play.api.mvc._
import org.mongodb.scala._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.play.json.collection.JSONCollection

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject()(cc: ControllerComponents, defaultApi: ReactiveMongoApi) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents {

  implicit def ec: ExecutionContext = cc.executionContext

  def collection: Future[JSONCollection] =
    database.map(_.collection[JSONCollection]("persons"))

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    defaultApi
    Ok(views.html.index("aaaa"))
  }

}
