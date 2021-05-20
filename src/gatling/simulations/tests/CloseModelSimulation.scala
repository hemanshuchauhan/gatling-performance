package tests

import helper.UrlHelpers
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import io.gatling.core.Predef._

import scala.concurrent.duration.DurationInt

class CloseModelSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = UrlHelpers.gatewayHttpProtocol()

  val scn: ScenarioBuilder = scenario("Jsonplaceholder Get Data Simulation")
    .exec(
      http("Get Json Data")
        .get("/comments")
        .check(status.is(200))
    )

  setUp(scn.inject(constantConcurrentUsers(10)
    during (5 seconds)))
    .protocols(httpProtocol)

}
