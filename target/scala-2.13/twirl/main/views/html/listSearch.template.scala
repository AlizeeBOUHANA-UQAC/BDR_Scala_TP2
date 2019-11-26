
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

object listSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Spell],Form[SearchForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

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
        """),format.raw/*18.9*/("""<tr><td>"""),_display_(/*18.18*/w/*18.19*/.name),format.raw/*18.24*/("""</td><td>Level """),_display_(/*18.40*/w/*18.41*/.level),format.raw/*18.47*/("""</td><td><a href=""""),_display_(/*18.66*/w/*18.67*/.url),format.raw/*18.71*/("""">"""),_display_(/*18.74*/w/*18.75*/.url),format.raw/*18.79*/("""</a></td></tr>
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
                  DATE: 2019-11-23T14:44:18.890
                  SOURCE: C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/app/views/listSearch.scala.html
                  HASH: db8b01b304e56f60abcfae552984c6cf4258e26e
                  MATRIX: 787->1|986->107|1015->111|1037->125|1076->127|1108->133|1156->189|1187->195|1202->202|1225->217|1285->240|1318->247|1350->253|1374->257|1403->260|1428->265|1470->277|1503->283|1639->393|1671->409|1711->411|1747->420|1783->429|1793->430|1819->435|1862->451|1872->452|1899->458|1945->477|1955->478|1980->482|2010->485|2020->486|2045->490|2097->512|2131->519|2197->618|2229->624|2262->648|2302->650|2336->658|2349->662|2375->679|2435->701|2471->710|2515->727|2529->732|2554->736|2584->739|2598->744|2627->752|2663->761|2707->775|2743->781|2776->788|2791->794|2814->808|2854->810|2888->818|2903->824|2939->839|2974->848|2989->854|3034->878|3068->886|3083->892|3127->915|3161->923|3176->929|3222->954|3257->962|3327->1002|3361->1006
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|34->10|36->12|41->17|41->17|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|43->19|44->20|49->25|50->26|50->26|50->26|51->27|51->27|51->27|51->27|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|55->31|56->32|58->34|58->34|58->34|58->34|59->35|59->35|59->35|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|65->41|66->42|67->43
                  -- GENERATED --
              */
          