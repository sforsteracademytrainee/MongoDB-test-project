package controllers

import DAO.UserDAO
import models.JsonFormats.userFormat
import models._

import javax.inject._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject() (cc: ControllerComponents, val reactiveMongoApi: ReactiveMongoApi, dao: UserDAO) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents {

  implicit def ec: ExecutionContext = cc.executionContext


  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def list = Action.async {
    dao.list().map { users =>
      // todo more
      Ok(views.html.index(users.toString()))
    }
  }

  def create = Action.async(parse.json) {
    _.body.validate[User].map { result =>
      dao.create(result).map { _ =>
        Created
      }
    }.getOrElse(Future.successful(BadRequest("Invalid movie")))
  }

}
