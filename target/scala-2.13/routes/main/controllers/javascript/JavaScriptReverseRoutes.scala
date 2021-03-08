// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/conf/routes
// @DATE:Mon Mar 08 23:54:51 GMT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

// @LINE:1
package controllers.javascript {

  // @LINE:3
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
        }
      """
    )
  
    // @LINE:8
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "read/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[reactivemongo.bson.BSONObjectID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def form: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.form",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
    // @LINE:7
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list"})
        }
      """
    )
  
    // @LINE:10
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[reactivemongo.bson.BSONObjectID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:3
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[reactivemongo.bson.BSONObjectID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseHoloController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HoloController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "updateHolo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[reactivemongo.bson.BSONObjectID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HoloController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "readAllHolo"})
        }
      """
    )
  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HoloController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createholo"})
        }
      """
    )
  
    // @LINE:15
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HoloController.read",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "readHolo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[reactivemongo.bson.BSONObjectID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
