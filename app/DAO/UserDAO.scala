package DAO

import models.JsonFormats.userFormat
import models.User
import reactivemongo.api.{Cursor, ReadPreference}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class UserDAO @Inject()(implicit ec: ExecutionContext, reactiveMongoApi: ReactiveMongoApi) {

  private def collection: Future[JSONCollection] = reactiveMongoApi.database.map(_.collection("users"))

  def list(limit: Int = 100): Future[Seq[User]] = {
    collection.flatMap(
      _.find(BSONDocument())
      .cursor[User](ReadPreference.Primary)
      .collect[Seq](limit, Cursor.FailOnError[Seq[User]]()))
  }

  def create(user: User): Future[WriteResult] = {
    collection.flatMap(_.insert(user))
  }

  def read(id: BSONObjectID): Future[Option[User]] = {
    collection.flatMap(_.find(BSONDocument("_id" -> id)).one[User]) // equivalent to { "_id" : id }
  }

}
