package models

import play.api.libs.json.{Json, OFormat}
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.json._

case class User(_id: Option[BSONObjectID],
                age: Int,
                firstName: String,
                lastName: String,
                feeds: List[Feed])

case class Feed(name: String, url: String)

object JsonFormats {

  implicit val feedFormat: OFormat[Feed] = Json.format[Feed]
  implicit val userFormat: OFormat[User] = Json.format[User]
}