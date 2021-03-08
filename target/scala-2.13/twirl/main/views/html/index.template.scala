
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<p>eggs</p>
    <p>"""),_display_(/*6.9*/message),format.raw/*6.16*/("""</p>

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-08T22:42:34.871827300
                  SOURCE: D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/app/views/index.scala.html
                  HASH: c1c6e5c5b1bee19b9a319f3e53e928e9c3a9708e
                  MATRIX: 729->1|841->18|871->23|902->46|941->48|975->56|1021->77|1048->84|1086->93
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|31->6|31->6|33->8
                  -- GENERATED --
              */
          