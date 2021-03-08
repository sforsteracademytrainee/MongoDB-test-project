// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/conf/routes
// @DATE:Mon Mar 08 23:54:51 GMT 2021


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
