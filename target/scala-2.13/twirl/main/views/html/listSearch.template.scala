
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
/*1.2*/import views.html.helper.select
/*2.2*/import views.html.helper.options
/*3.2*/import views.html.helper.inputRadioGroup

object listSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Spell],Form[SearchForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(spells: Seq[Spell], form: Form[SearchForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
  """),_display_(/*6.4*/main("Search")/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""

    """),format.raw/*8.5*/("""<h1>Search</h1>

    """),format.raw/*10.40*/("""
    """),_display_(/*11.6*/request/*11.13*/.flash.data.map/*11.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*11.51*/("""
      """),format.raw/*12.7*/("""<div>"""),_display_(/*12.13*/name),format.raw/*12.17*/(""": """),_display_(/*12.20*/value),format.raw/*12.25*/("""</div>
    """)))}),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""<table>
      <thead>
        <tr><th>Name</th><th>Level</th><th>URL</th>
      </thead>
      <tbody>
      """),_display_(/*20.8*/for(w <- spells) yield /*20.24*/ {_display_(Seq[Any](format.raw/*20.26*/("""
        """),format.raw/*21.9*/("""<tr><td>"""),_display_(/*21.18*/w/*21.19*/.name),format.raw/*21.24*/("""</td><td>Level """),_display_(/*21.40*/w/*21.41*/.level),format.raw/*21.47*/("""</td><td><a href=""""),_display_(/*21.66*/w/*21.67*/.url),format.raw/*21.71*/("""">"""),_display_(/*21.74*/w/*21.75*/.url),format.raw/*21.79*/("""</a></td></tr>
      """)))}),format.raw/*22.8*/("""
      """),format.raw/*23.7*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*28.66*/("""
    """),_display_(/*29.6*/if(form.hasGlobalErrors)/*29.30*/ {_display_(Seq[Any](format.raw/*29.32*/("""
      """),_display_(/*30.8*/form/*30.12*/.globalErrors.map/*30.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*30.51*/("""
        """),format.raw/*31.9*/("""<div>
          """),_display_(/*32.12*/error/*32.17*/.key),format.raw/*32.21*/(""": """),_display_(/*32.24*/error/*32.29*/.message),format.raw/*32.37*/("""
        """),format.raw/*33.9*/("""</div>
      """)))}),format.raw/*34.8*/("""
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/helper/*37.12*/.form(postUrl)/*37.26*/ {_display_(Seq[Any](format.raw/*37.28*/("""
      """),_display_(/*38.8*/helper/*38.14*/.CSRF.formField),format.raw/*38.29*/("""

      """),_display_(/*40.8*/helper/*40.14*/.inputText(form("opt1"))),format.raw/*40.38*/("""
      """),_display_(/*41.8*/helper/*41.14*/.inputText(form("opt2"))),format.raw/*41.38*/("""
      """),_display_(/*42.8*/helper/*42.14*/.inputText(form("opt3"))),format.raw/*42.38*/("""
      """),_display_(/*43.8*/helper/*43.14*/.inputRadioGroup(form("opt4"),
      options = Seq("M"->"Male","F"->"Female"),
        Symbol("_label") -> "Gender",
        Symbol("_error") -> form("gender").error.map(_.withMessage("select gender")))),format.raw/*46.86*/("""


      """),format.raw/*49.7*/("""<button>Create Req Search</button>
    """)))}),format.raw/*50.6*/("""
  """)))}),format.raw/*51.4*/("""
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
                  DATE: 2019-11-26T09:36:04.438
                  SOURCE: C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/app/views/listSearch.scala.html
                  HASH: 4bd317cd9437809bce2fe7fcd810689d98922a41
                  MATRIX: 432->1|471->34|511->68|914->110|1113->216|1142->220|1164->234|1203->236|1235->242|1284->298|1316->304|1332->311|1356->326|1417->349|1451->356|1484->362|1509->366|1539->369|1565->374|1607->386|1640->392|1776->502|1808->518|1848->520|1884->529|1920->538|1930->539|1956->544|1999->560|2009->561|2036->567|2082->586|2092->587|2117->591|2147->594|2157->595|2182->599|2234->621|2268->628|2334->727|2366->733|2399->757|2439->759|2473->767|2486->771|2512->788|2572->810|2608->819|2652->836|2666->841|2691->845|2721->848|2735->853|2764->861|2800->870|2844->884|2880->890|2913->897|2928->903|2951->917|2991->919|3025->927|3040->933|3076->948|3111->957|3126->963|3171->987|3205->995|3220->1001|3265->1025|3299->1033|3314->1039|3359->1063|3393->1071|3408->1077|3631->1279|3667->1288|3737->1328|3771->1332
                  LINES: 17->1|18->2|19->3|24->4|29->5|30->6|30->6|30->6|32->8|34->10|35->11|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|37->13|39->15|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|52->28|53->29|53->29|53->29|54->30|54->30|54->30|54->30|55->31|56->32|56->32|56->32|56->32|56->32|56->32|57->33|58->34|59->35|61->37|61->37|61->37|61->37|62->38|62->38|62->38|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|70->46|73->49|74->50|75->51
                  -- GENERATED --
              */
          