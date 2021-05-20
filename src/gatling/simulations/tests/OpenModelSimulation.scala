package tests

import helper.UrlHelpers
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class OpenModelSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = UrlHelpers.gatewayHttpProtocol()

  val scn: ScenarioBuilder = scenario("Jsonplaceholder Get Data Simulation")
    .exec(
      http("Get Json Data")
        .get("/comments")
        .check(status.is(200))
    )

  setUp(scn.inject(atOnceUsers(50))
    .protocols(httpProtocol))

}
