
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*9.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*12.10*/content),format.raw/*12.17*/("""
    """),format.raw/*13.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-04T10:30:55.860151
                  SOURCE: D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/app/views/main.scala.html
                  HASH: d7964b90203cef5def32e027c93273ef80111956
                  MATRIX: 733->1|858->31|888->35|977->98|1002->103|1091->166|1105->172|1167->213|1255->275|1269->281|1329->320|1381->346|1395->352|1456->393|1553->463|1581->470|1614->476
                  LINES: 21->1|26->1|28->3|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|37->12|37->12|38->13
                  -- GENERATED --
              */
          