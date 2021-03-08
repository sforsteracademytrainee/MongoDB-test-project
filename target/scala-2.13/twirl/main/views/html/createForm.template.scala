
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[UserTemp],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserTemp])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Form")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Create a user</h1>

    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.HomeController.form)/*6.54*/ {_display_(Seq[Any](format.raw/*6.56*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(userForm("age"))),format.raw/*7.43*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(userForm("firstName"))),format.raw/*8.49*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(userForm("lastName"))),format.raw/*9.48*/("""
        """),format.raw/*10.9*/("""<button type="submit">Submit</button>
    """)))}),format.raw/*11.6*/("""

""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[UserTemp],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(messages)

  def f:((Form[UserTemp]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (messages) => apply(userForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-08T22:42:34.822331900
                  SOURCE: D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/app/views/createForm.scala.html
                  HASH: ab9c0c530d6494cd3403b058336bd038be8c46ea
                  MATRIX: 751->1|901->56|931->61|951->73|990->75|1022->81|1078->112|1092->118|1142->160|1181->162|1218->173|1232->179|1279->206|1316->217|1330->223|1383->256|1420->267|1434->273|1486->305|1523->315|1597->359|1632->364
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|36->11|38->13
                  -- GENERATED --
              */
          