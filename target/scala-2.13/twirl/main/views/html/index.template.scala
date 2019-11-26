
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Please go to <a href=""""),_display_(/*6.36*/routes/*6.42*/.SearchController.listSearch),format.raw/*6.70*/("""">"""),_display_(/*6.73*/routes/*6.79*/.SearchController.listSearch),format.raw/*6.107*/("""</a></li>
      </ul>
    </div>
  """)))}),format.raw/*9.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-23T14:41:35.375
                  SOURCE: C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/app/views/index.scala.html
                  HASH: f6b15a2ae27b309f15eb847533a6528bce669869
                  MATRIX: 722->1|818->4|847->8|878->31|917->33|948->38|1026->90|1040->96|1088->124|1117->127|1131->133|1180->161|1245->197
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|30->6|30->6|30->6|33->9
                  -- GENERATED --
              */
          