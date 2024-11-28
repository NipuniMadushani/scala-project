package ch.usi.si.msde.edsl.assignment_03

import scala.language.implicitConversions
import model.*
import model.HttpRequestModel.*
import model.JsonModel.*
import model.AsyncContext
import scala.concurrent.Future
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap

object JsonDSL:

  // Define a base trait for JSON values
  sealed trait JsonValue

  // Case classes for JSON primitives and structures
  case class JsonString(value: String) extends JsonValue:
    override def toString: String = s""""$value""""

  case class JsonNumber(value: Double) extends JsonValue:
    override def toString: String = value.toString

  case class JsonBoolean(value: Boolean) extends JsonValue:
    override def toString: String = value.toString

  case class JsonObject(fields: Map[String, JsonValue]) extends JsonValue:
    override def toString: String =
      val fieldStrings = fields.map { case (key, value) => s""""$key": $value""" }
      s"{${fieldStrings.mkString(", ")}}"

  case class JsonArray(values: Seq[JsonValue]) extends JsonValue:
    override def toString: String =
      values.map(_.toString).mkString("[", ", ", "]")

  // DSL Functions
  def jsonObject(fields: (String, JsonValue)*): JsonObject = JsonObject(fields.toMap)

  // Implicit class for key-value pairs
  implicit class JsonKey(key: String):
    def ~>(value: String): (String, JsonValue) = key -> JsonString(value)
    def ~>(value: Double): (String, JsonValue) = key -> JsonNumber(value)
    def ~>(value: Boolean): (String, JsonValue) = key -> JsonBoolean(value)
    def ~>>(values: JsonValue*): (String, JsonValue) = key -> JsonArray(values)

end JsonDSL

@main def exercise1() =
  // DO NOT touch this
  import JsonDSL.{given, *}

  /**
   * An empty JSON object.
   */
  val emptyJson = jsonObject()
  println(emptyJson)

  /**
   * An object with key-pairs, equivalent to: { "name": "morpheus", "job": "leader" }
   */
  val jsonFragment1 = jsonObject(
    "name" ~> "morpheus",
    "job" ~> "leader"
  )
  println(jsonFragment1)

  /**
   * A more complex JSON object with booleans, numbers, and arrays.
   */
  val jsonFragment2 = jsonObject(
    "title" ~> "The Matrix",
    "sequel" ~> false,
    "duration" ~> 136.0,
    "directors" ~>> (
      jsonObject(
        "firstName" ~> "Lana",
        "lastName" ~> "Wachowski"
      ),
      jsonObject(
        "firstName" ~> "Lilly",
        "lastName" ~> "Wachowski"
      )
    )
  )
  println(jsonFragment2)

end exercise1
