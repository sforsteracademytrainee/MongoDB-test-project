// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/conf/routes
// @DATE:Mon Mar 08 23:54:51 GMT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  Assets_1: controllers.Assets,
  // @LINE:3
  HomeController_2: controllers.HomeController,
  // @LINE:13
  HoloController_0: controllers.HoloController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    Assets_1: controllers.Assets,
    // @LINE:3
    HomeController_2: controllers.HomeController,
    // @LINE:13
    HoloController_0: controllers.HoloController
  ) = this(errorHandler, Assets_1, HomeController_2, HoloController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_2, HoloController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.HomeController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list""", """controllers.HomeController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """read/""" + "$" + """id<[^/]+>""", """controllers.HomeController.read(id:reactivemongo.bson.BSONObjectID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delete(id:reactivemongo.bson.BSONObjectID)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(id:reactivemongo.bson.BSONObjectID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.HomeController.form"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createholo""", """controllers.HoloController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """readAllHolo""", """controllers.HoloController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """readHolo/""" + "$" + """id<[^/]+>""", """controllers.HoloController.read(id:reactivemongo.bson.BSONObjectID)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateHolo/""" + "$" + """id<[^/]+>""", """controllers.HoloController.update(id:reactivemongo.bson.BSONObjectID)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_HomeController_create2_invoker = createInvoker(
    HomeController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "POST",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_HomeController_list3_invoker = createInvoker(
    HomeController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Nil,
      "GET",
      this.prefix + """list""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_read4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("read/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_read4_invoker = createInvoker(
    HomeController_2.read(fakeValue[reactivemongo.bson.BSONObjectID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "read",
      Seq(classOf[reactivemongo.bson.BSONObjectID]),
      "GET",
      this.prefix + """read/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete5_invoker = createInvoker(
    HomeController_2.delete(fakeValue[reactivemongo.bson.BSONObjectID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[reactivemongo.bson.BSONObjectID]),
      "GET",
      this.prefix + """delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_update6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update6_invoker = createInvoker(
    HomeController_2.update(fakeValue[reactivemongo.bson.BSONObjectID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[reactivemongo.bson.BSONObjectID]),
      "PUT",
      this.prefix + """update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_form7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_HomeController_form7_invoker = createInvoker(
    HomeController_2.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "form",
      Nil,
      "GET",
      this.prefix + """form""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HoloController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createholo")))
  )
  private[this] lazy val controllers_HoloController_create8_invoker = createInvoker(
    HoloController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HoloController",
      "create",
      Nil,
      "POST",
      this.prefix + """createholo""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HoloController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("readAllHolo")))
  )
  private[this] lazy val controllers_HoloController_list9_invoker = createInvoker(
    HoloController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HoloController",
      "list",
      Nil,
      "GET",
      this.prefix + """readAllHolo""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HoloController_read10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("readHolo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HoloController_read10_invoker = createInvoker(
    HoloController_0.read(fakeValue[reactivemongo.bson.BSONObjectID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HoloController",
      "read",
      Seq(classOf[reactivemongo.bson.BSONObjectID]),
      "GET",
      this.prefix + """readHolo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HoloController_update11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateHolo/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HoloController_update11_invoker = createInvoker(
    HoloController_0.update(fakeValue[reactivemongo.bson.BSONObjectID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HoloController",
      "update",
      Seq(classOf[reactivemongo.bson.BSONObjectID]),
      "PUT",
      this.prefix + """updateHolo/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:3
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_2.index)
      }
  
    // @LINE:6
    case controllers_HomeController_create2_route(params@_) =>
      call { 
        controllers_HomeController_create2_invoker.call(HomeController_2.create)
      }
  
    // @LINE:7
    case controllers_HomeController_list3_route(params@_) =>
      call { 
        controllers_HomeController_list3_invoker.call(HomeController_2.list)
      }
  
    // @LINE:8
    case controllers_HomeController_read4_route(params@_) =>
      call(params.fromPath[reactivemongo.bson.BSONObjectID]("id", None)) { (id) =>
        controllers_HomeController_read4_invoker.call(HomeController_2.read(id))
      }
  
    // @LINE:9
    case controllers_HomeController_delete5_route(params@_) =>
      call(params.fromPath[reactivemongo.bson.BSONObjectID]("id", None)) { (id) =>
        controllers_HomeController_delete5_invoker.call(HomeController_2.delete(id))
      }
  
    // @LINE:10
    case controllers_HomeController_update6_route(params@_) =>
      call(params.fromPath[reactivemongo.bson.BSONObjectID]("id", None)) { (id) =>
        controllers_HomeController_update6_invoker.call(HomeController_2.update(id))
      }
  
    // @LINE:11
    case controllers_HomeController_form7_route(params@_) =>
      call { 
        controllers_HomeController_form7_invoker.call(HomeController_2.form)
      }
  
    // @LINE:13
    case controllers_HoloController_create8_route(params@_) =>
      call { 
        controllers_HoloController_create8_invoker.call(HoloController_0.create)
      }
  
    // @LINE:14
    case controllers_HoloController_list9_route(params@_) =>
      call { 
        controllers_HoloController_list9_invoker.call(HoloController_0.list)
      }
  
    // @LINE:15
    case controllers_HoloController_read10_route(params@_) =>
      call(params.fromPath[reactivemongo.bson.BSONObjectID]("id", None)) { (id) =>
        controllers_HoloController_read10_invoker.call(HoloController_0.read(id))
      }
  
    // @LINE:16
    case controllers_HoloController_update11_route(params@_) =>
      call(params.fromPath[reactivemongo.bson.BSONObjectID]("id", None)) { (id) =>
        controllers_HoloController_update11_invoker.call(HoloController_0.update(id))
      }
  }
}
