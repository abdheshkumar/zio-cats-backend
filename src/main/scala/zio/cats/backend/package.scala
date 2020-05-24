package zio.cats

import zio.ZEnv
import zio.cats.backend.persistence.UserPersistence
import zio.cats.backend.services.healthcheck.HealthCheck
import zio.cats.backend.services.reqres.reqres.ReqResClient
import zio.cats.backend.services.user.UserService
import zio.cats.backend.system.config.Config
import zio.logging.Logging

package object backend {

  type UserServiceEnv = UserService with UserPersistence with ReqResClient with Logging
  type AppEnv         = UserServiceEnv with ZEnv with Config with HealthCheck

}
