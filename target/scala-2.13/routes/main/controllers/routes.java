// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Documents/QA ACADEMY/Scala Materials/Play/MongoDB-test-project/conf/routes
// @DATE:Mon Mar 08 23:56:10 GMT 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHoloController HoloController = new controllers.ReverseHoloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHoloController HoloController = new controllers.javascript.ReverseHoloController(RoutesPrefix.byNamePrefix());
  }

}
