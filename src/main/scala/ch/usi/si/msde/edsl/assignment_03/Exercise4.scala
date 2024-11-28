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

trait RequestAssertionWithBooleanPredicatesDSL extends RequestAssertionDSL:

  // Do not touch this import
  import model.AsyncContext.{given, *}

  // Write your DSL here

end RequestAssertionWithBooleanPredicatesDSL

class Exercise4_Example() extends RequestAssertionWithBooleanPredicatesDSL:

  // Do not touch this
  import JsonDSL.{given, *}
  import HttpRequestDSL.{given, *}
  import model.AsyncContext.{given, *}

  // Exercise 4: Basic respond/fail assertions

  // "a get on a non-existing user" should "respond with 404" := eventually {
  //   a.GET on https `://` "reqres.in" / "api" / "user" / "-3721"
  // } should respond `with` statusCode(404) or statusCode(200)

  // "a get on a user" should "respond with 404 or 200 and contentType application/json" := eventually {
  //   a.GET on https("reqres.in") / "api" / "user" / "3"
  // } should respond `with` statusCode(404) or statusCode(200) and contentType(
  //   "application/json"
  // )

  // do ** NOT ** remove this
  run()
end Exercise4_Example

@main def exercise4 = Exercise4_Example()
