package ch.usi.si.msde.edsl.assignment_03

import scala.language.implicitConversions

import scala.concurrent.Future
import scala.util.{Try, Success, Failure}
import scala.util.Success
import model.HttpRequestModel.*
import model.AssertionModel.*
import model.AssertionExecutor
import scala.concurrent.Await
import ch.usi.si.msde.edsl.assignment_03.model.JsonModel.JsonObject
import ch.usi.si.msde.edsl.assignment_03.model.JsonModel.JsonValue

trait RequestAssertionDSL extends AssertionExecutor:

  // Do not touch this import
  import model.AsyncContext.*

  // Write your DSL here

end RequestAssertionDSL

class Exercise3_Example extends RequestAssertionDSL:

  // Do not touch this
  import JsonDSL.{given, *}
  import HttpRequestDSL.{given, *}
  import model.AsyncContext.{given, *}

  // Exercise 3: Basic respond/fail assertions
  // "a get on user 2" should "respond with 200 ok" := eventually {
  //   a.GET on https `://` "reqres.in" / "api" / "user" / "2"
  // } should respond `with` statusCode(200)

  // "a get on user 3" should "respond with 200" := eventually {
  //   a.GET on https `://` "reqres.in" / "api" / "user" / "3"
  // } should respond `with` statusCode(200)

  // "a get on user 3" should "respond with some json" := eventually {
  //   a.GET on https `://` "reqres.in" / "api" / "user" / "3"
  // } should respond `with` contentType("application/json")

  // "a get on a non-existing user" should "respond with 404" := eventually {
  //   a.GET on https `://` "reqres.in" / "api" / "user" / "-3721"
  // } should respond `with` statusCode(400)

  // "a GET on a non-existing domain" should "fail" := eventually {
  //   a.GET on https `://` "www.usi.chh"
  // } should fail

  // "a login without password" should "respond with status code 400" := eventually {
  //   a.POST on https `://` "reqres.in" / "api" / "login" withEntity jsonObject(
  //     "email" ~> "morpheus@nebuchadnezzar"
  //   )
  // } should respond `with` contentType("application/json")

  // "a login without password" should "respond with a json body containing an error" := eventually {
  //   a.POST on https `://` "reqres.in" / "api" / "login" withEntity jsonObject(
  //     "email" ~> "morpheus@nebuchadnezzar"
  //   )
  // } should respond `with` jsonObject(
  //   "error" ~> "Missing email or username"
  // )

  // do ** NOT ** remove this
  run()
end Exercise3_Example

@main def exercise3 = Exercise3_Example()
