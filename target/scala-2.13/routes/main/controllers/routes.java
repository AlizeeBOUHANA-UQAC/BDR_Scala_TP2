// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/conf/routes
// @DATE:Tue Nov 26 08:53:28 EST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
  }

}
