package DAO

import play.modules.reactivemongo.ReactiveMongoApi

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserDAO @Inject()(implicit ec: ExecutionContext, reactiveMongoApi: ReactiveMongoApi) {



}
