package helper

import java.net.URI
import java.util.UUID.randomUUID

import io.gatling.core.Predef.{configuration, csv}

import scala.io.Source

object FeederHelpers {
  val requestFilePath: String = "/requestTemplate.json"
  val csvFeeder = csv("csvFeeder.csv").circular //this will feed the file to performance test
  val jsonFeeder = csv("jsonFeeder.json").random //this will feed the file to performance test

  def getFileContent(filePath: String): String = {
    val res: URI = getClass().getResource(filePath).toURI
    val fileContent = Source.fromFile(res).mkString
    fileContent
  }


  val feeder = Iterator.continually(Map(
    "test-header" -> randomUUID().toString,
    "requestBody" -> {
      getFileContent(requestFilePath)
    }
  ))
}

