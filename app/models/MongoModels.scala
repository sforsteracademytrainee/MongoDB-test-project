package models

import play.api.data.Form
import play.api.data.Forms.{mapping, nonEmptyText, number}
import play.api.libs.json.{Json, OFormat}
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.json._

case class User(_id: Option[BSONObjectID],
                age: Int,
                firstName: String,
                lastName: String)

case class UserTemp(age: Int,
                    firstName: String,
                    lastName: String)

object UserForm {
  val form: Form[UserTemp] = Form(
    mapping(
      "age" -> number(min = 0),
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText
    )(UserTemp.apply)(UserTemp.unapply)
  )
}

case class Holo
(
  _id: Option[BSONObjectID],
  name : String,
  branch : String,
  gen : Int
)

//For forms
case class HoloTemp
(
  name : String,
  branch : String,
  gen : Int
)

object HoloForm
{
  val form : Form[HoloTemp] = Form(
    mapping(
      "name" -> nonEmptyText,
      "branch" -> nonEmptyText,
      "gen" -> number(min = 0, max = 5)
    )(HoloTemp.apply)(HoloTemp.unapply)
  )
}

object JsonFormats  {
  implicit val holoFormat: OFormat[Holo] = Json.format[Holo]
  implicit val userFormat: OFormat[User] = Json.format[User]
}