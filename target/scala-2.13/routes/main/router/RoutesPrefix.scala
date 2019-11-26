// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alize/IdeaProjects/ACTUAL Projects/play-samples-play-scala-forms-example/conf/routes
// @DATE:Sat Nov 23 14:39:51 EST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
