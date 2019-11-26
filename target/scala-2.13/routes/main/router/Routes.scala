// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/conf/routes
// @DATE:Sat Nov 23 14:39:51 EST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  SearchController_0: controllers.SearchController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SearchController_0: controllers.SearchController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, SearchController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SearchController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.SearchController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.listSearch"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.createSearch"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_SearchController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SearchController_index0_invoker = createInvoker(
    SearchController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_SearchController_listSearch1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_listSearch1_invoker = createInvoker(
    SearchController_0.listSearch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "listSearch",
      Nil,
      "GET",
      this.prefix + """search""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SearchController_createSearch2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_createSearch2_invoker = createInvoker(
    SearchController_0.createSearch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "createSearch",
      Nil,
      "POST",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_SearchController_index0_route(params@_) =>
      call { 
        controllers_SearchController_index0_invoker.call(SearchController_0.index)
      }
  
    // @LINE:9
    case controllers_SearchController_listSearch1_route(params@_) =>
      call { 
        controllers_SearchController_listSearch1_invoker.call(SearchController_0.listSearch)
      }
  
    // @LINE:10
    case controllers_SearchController_createSearch2_route(params@_) =>
      call { 
        controllers_SearchController_createSearch2_invoker.call(SearchController_0.createSearch)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
