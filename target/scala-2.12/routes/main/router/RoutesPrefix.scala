// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/simon/IdeaProjects/MongoDB-test-project/conf/routes
// @DATE:Thu Mar 04 14:16:30 GMT 2021


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
