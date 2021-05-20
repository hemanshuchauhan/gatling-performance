package tests

import helper.{FeederHelpers, UrlHelpers}
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class FeederSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = UrlHelpers.gatewayHttpProtocol()

  val scn: ScenarioBuilder = scenario("Jsonplaceholder Post Data Simulation")
    .feed(FeederHelpers.feeder)
    .exec(
      http("Post Json Data")
        .post("/comments")
        .header("header", "${test-header}")
        .body(StringBody("${requestBody}")).asJson
        .check(status.is(200))
    )

  setUp(scn.inject(atOnceUsers(1))
    .protocols(httpProtocol))

}
