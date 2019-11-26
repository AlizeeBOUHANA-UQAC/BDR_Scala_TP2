package controllers

import javax.inject.Inject

import models.Spell
import models.ReqSearch
import play.api.data._
import play.api.i18n._
import play.api.mvc._

/**
 * The classic WidgetController using MessagesAbstractController.
 *
 * Instead of MessagesAbstractController, you can use the I18nSupport trait,
 * which provides implicits that create a Messages instance from a request
 * using implicit conversion.
 *
 * See https://www.playframework.com/documentation/2.7.x/ScalaForms#passing-messagesprovider-to-form-helpers
 * for details.
 */
class SearchController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import SearchForm._

  //DATA
  private val spells = scala.collection.mutable.ArrayBuffer(
    Spell("Abadar's Truthtelling", "http://www.dxcontent.com/SDB_SpellBlock.asp?SDBID=1725", 1),
    Spell("Ablative Barrier", "http://www.dxcontent.com/SDB_SpellBlock.asp?SDBID=1269", 2),
    Spell("Absorbing Inhalation", "http://www.dxcontent.com/SDB_SpellBlock.asp?SDBID=1526", 4)
  )

  // The URL to the widget.  You can call this directly from the template, but it
  // can be more convenient to leave the template completely stateless i.e. all
  // of the "WidgetController" references are inside the .scala file.
  private val postUrl = routes.SearchController.createReqSearch()





  def index = Action {
    Ok(views.html.index())
  }

  def listSearch: Action[AnyContent] = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.listSearch(spells.toSeq, form, postUrl))
  }

  // This will be the action that handles our form post
  /*
  def createSearch = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[Data] =>
      // This is the bad case, where the form had validation errors.
      // Let's show the user the form again, with the errors highlighted.
      // Note how we pass the form with errors to the template.
      BadRequest(views.html.listSearch(spells.toSeq, formWithErrors, postUrl))
    }
    val successFunction = { data: Data =>
      // This is the good case, where the form was successfully parsed as a Data object.
      val spell = Spell(name = data.name, url = data.url, level = data.level)
      spells.append(spell)
      Redirect(routes.SearchController.listSearch()).flashing("info" -> "Search added!")
    }
  }
  */

    def createReqSearch: Action[AnyContent] = Action { implicit request: MessagesRequest[AnyContent] =>
      val errorFunction = { formWithErrors: Form[Data] =>
        println("false req" + formWithErrors.data)
        BadRequest(views.html.listSearch(spells.toSeq, formWithErrors, postUrl))
      }
      val successFunction = { data: Data =>
        val req = ReqSearch(opt1_nomSpell = data.opt1, opt2_class = data.opt2, opt3_levelMin = data.opt3, opt4_bool = data.opt4);
        println("VICTOIRE" + req)
        spells.append(req.createSpellReq())
        Redirect(routes.SearchController.listSearch()).flashing("info" -> "Search added !")
    }




    val formValidationResult = form.bindFromRequest
    formValidationResult.fold(errorFunction, successFunction)
  }
}
