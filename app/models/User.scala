package models

import play.api.data.Form
import play.api.data.Forms.{mapping, nonEmptyText, number, text}
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

object JsonFormats {

  implicit val userFormat: OFormat[User] = Json.format[User]
}