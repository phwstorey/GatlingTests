package job

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class JobCreationSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8080/job/create")
    .acceptHeader("application/json")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn = scenario("Create new job returns OK").repeat(1000) {
    exec(http("Create job")
      .post("/").body(StringBody("""{"jobName": "doSomthing"}""")).asJson
      .check(status.is(201)))
  }

  setUp(scn.inject(atOnceUsers(8)))
    .assertions(global.responseTime.max.lt(60))
    .protocols(httpProtocol)
}
