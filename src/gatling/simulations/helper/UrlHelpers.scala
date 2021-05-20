package helper

import java.io.File
import java.net.URI

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import com.typesafe.config._


object UrlHelpers {
  val env = System.getProperty("env.type");
  val res: URI = getClass().getResource("/application.properties").toURI
  val myConfigFile = new File(res)
  val fileConfig = ConfigFactory.parseFile(myConfigFile)
  val conf = ConfigFactory.load(fileConfig)

  def gatewayHttpProtocol(): HttpProtocolBuilder = {
    http
      .baseUrl(conf.getString("gatewayHost"))
//      .proxy(Proxy(conf.getString("proxyHost"), conf.getInt("proxyPort")).httpsPort(conf.getInt("proxyPort")))
  }
}