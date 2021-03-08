package DAO

import models.Holo
import models.JsonFormats.holoFormat
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.{Cursor, ReadPreference}
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class HoloDAO @Inject()(implicit ec: ExecutionContext, reactiveMongoApi: ReactiveMongoApi) {
  //Creates new collection
  private def collection: Future[JSONCollection] = reactiveMongoApi.database.map(_.collection("holomem"))

  //CRUD FUNCTIONALITIES

  //READ ALL
  def list(limit: Int = 100): Future[Seq[Holo]] = {
    collection.flatMap(
      _.find(BSONDocument())
        .cursor[Holo](ReadPreference.Primary)
        .collect[Seq](limit, Cursor.FailOnError[Seq[Holo]]()))
  }

  //CREATE
  def create(holo: Holo): Future[WriteResult] =
  {
    collection.flatMap(_.insert(holo))
  }

  def read (id: BSONObjectID) : Future[Option[Holo]] =
  {
    collection.flatMap(_.find(BSONDocument("_id" -> id)).one[Holo])
  }
}
