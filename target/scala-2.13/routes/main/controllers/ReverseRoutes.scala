// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/conf/routes
// @DATE:Tue Nov 26 08:53:28 EST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createReqSearch(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def listSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
  }


}
