package controllers
import models.Holo
import DAO.HoloDAO
import models.JsonFormats.holoFormat

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.i18n.I18nSupport
import play.api.libs.json.Json

import javax.inject._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.bson.BSONObjectID

import scala.concurrent.Future

@Singleton
class HoloController @Inject() (cc: ControllerComponents, val reactiveMongoApi: ReactiveMongoApi, dao : HoloDAO) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents with I18nSupport
{

  def create = Action.async(parse.json)
  {
    _.body.validate[Holo].map { result =>
      dao.create(result).map { _ =>
        Created
      }
    }.getOrElse(Future.successful(BadRequest("Invalid holomem")))
  }

  def list = Action.async
  {
    dao.list().map { holo =>
      Ok(views.html.holoIndex(holo.toString()))
    }
  }

  def read(id: BSONObjectID) = Action.async
  {
    dao.read(id).map { holo =>
      holo.map { result =>
        Ok(Json.toJson(result))
      }.getOrElse(NotFound)
    }
  }
}
