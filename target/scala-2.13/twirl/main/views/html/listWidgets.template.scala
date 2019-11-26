
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Spell],Form[SearchForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(spells: Seq[Spell], form: Form[SearchForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Search")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),format.raw/*5.5*/("""<h1>Search</h1>

    """),format.raw/*7.40*/("""
    """),_display_(/*8.6*/request/*8.13*/.flash.data.map/*8.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*8.51*/("""
      """),format.raw/*9.7*/("""<div>"""),_display_(/*9.13*/name),format.raw/*9.17*/(""": """),_display_(/*9.20*/value),format.raw/*9.25*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<table>
      <thead>
        <tr><th>Name</th><th>Level</th><th>URL</th>
      </thead>
      <tbody>
      """),_display_(/*17.8*/for(w <- spells) yield /*17.24*/ {_display_(Seq[Any](format.raw/*17.26*/("""
        """),format.raw/*18.9*/("""<tr><td>"""),_display_(/*18.18*/w/*18.19*/.name),format.raw/*18.24*/("""</td><td>Level """),_display_(/*18.40*/w/*18.41*/.level),format.raw/*18.47*/("""</td></tr><a href=""""),_display_(/*18.67*/w/*18.68*/.url),format.raw/*18.72*/("""">"""),_display_(/*18.75*/w/*18.76*/.url),format.raw/*18.80*/("""</a>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*25.66*/("""
    """),_display_(/*26.6*/if(form.hasGlobalErrors)/*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
      """),_display_(/*27.8*/form/*27.12*/.globalErrors.map/*27.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*27.51*/("""
        """),format.raw/*28.9*/("""<div>
          """),_display_(/*29.12*/error/*29.17*/.key),format.raw/*29.21*/(""": """),_display_(/*29.24*/error/*29.29*/.message),format.raw/*29.37*/("""
        """),format.raw/*30.9*/("""</div>
      """)))}),format.raw/*31.8*/("""
    """)))}),format.raw/*32.6*/("""

    """),_display_(/*34.6*/helper/*34.12*/.form(postUrl)/*34.26*/ {_display_(Seq[Any](format.raw/*34.28*/("""
      """),_display_(/*35.8*/helper/*35.14*/.CSRF.formField),format.raw/*35.29*/("""

      """),_display_(/*37.8*/helper/*37.14*/.inputText(form("type"))),format.raw/*37.38*/("""
      """),_display_(/*38.8*/helper/*38.14*/.inputText(form("url"))),format.raw/*38.37*/("""
      """),_display_(/*39.8*/helper/*39.14*/.inputText(form("price"))),format.raw/*39.39*/("""

      """),format.raw/*41.7*/("""<button>Create Req Search</button>
    """)))}),format.raw/*42.6*/("""
  """)))}),format.raw/*43.4*/("""
"""))
      }
    }
  }

  def render(spells:Seq[Spell],form:Form[SearchForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(spells,form,postUrl)(request)

  def f:((Seq[Spell],Form[SearchForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (spells,form,postUrl) => (request) => apply(spells,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-23T14:29:17.414
                  SOURCE: C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/app/views/listSearch.scala.html
                  HASH: b36dee952f86e996c46b2f795822413c46bb6456
                  MATRIX: 788->1|987->107|1016->111|1038->125|1077->127|1109->133|1157->189|1188->195|1203->202|1226->217|1286->240|1319->247|1351->253|1375->257|1404->260|1429->265|1471->277|1504->283|1640->393|1672->409|1712->411|1748->420|1784->429|1794->430|1820->435|1863->451|1873->452|1900->458|1947->478|1957->479|1982->483|2012->486|2022->487|2047->491|2089->503|2123->510|2189->609|2221->615|2254->639|2294->641|2328->649|2341->653|2367->670|2427->692|2463->701|2507->718|2521->723|2546->727|2576->730|2590->735|2619->743|2655->752|2699->766|2735->772|2768->779|2783->785|2806->799|2846->801|2880->809|2895->815|2931->830|2966->839|2981->845|3026->869|3060->877|3075->883|3119->906|3153->914|3168->920|3214->945|3249->953|3319->993|3353->997
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|34->10|36->12|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|49->25|50->26|50->26|50->26|51->27|51->27|51->27|51->27|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|55->31|56->32|58->34|58->34|58->34|58->34|59->35|59->35|59->35|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|65->41|66->42|67->43
                  -- GENERATED --
              */
          