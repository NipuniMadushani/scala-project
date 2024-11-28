package ch.usi.si.msde.edsl.assignment_03

import scala.language.implicitConversions

import model.*
import model.HttpRequestModel.*
import model.JsonModel.*
import model.AsyncContext
import scala.concurrent.Future
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap

object HttpRequestDSL:

  // ** Do not touch this **
  import JsonDSL.*
  import AsyncContext.{given, *}

  // ** Implement the DSL here **

end HttpRequestDSL

@main def exercise2() =

  // DO NOT touch this
  import JsonDSL.{given, *}
  import HttpRequestDSL.{given, *}
  import AsyncContext.{given, *}

  // Exercise 2
  // val getRequest1: Future[Response] =
  //   a.GET on https `://` "www.google.com" / "search"

  // val getRequest2 = a.GET on https `://` "www.usi.ch" / "en" / "university"
  // val getRequest3 = a.GET on http `://` "usi.cch"
  // val getRequest4 =
  //   a.GET on https `://` "reqres.in" / "api" / "users" ? ("page" =:= "1" & "per_page" =:= "4")

  // val postRequest1 =
  //   a.POST on https `://` "reqres.in" / "api" / "users" withEntity jsonObject(
  //     "name" ~> "morpheus",
  //     "job" ~> "leader"
  //   )

  // val postRequest2 =
  //   a.POST on https `://` "reqres.in" / "api" / "register" withEntity jsonObject(
  //     "email" ~> "agent.smith@reqres.in",
  //     "password" ~> "OguhGnivaew"
  //   )

  // val postRequest3 =
  //   a.POST on https `://` "reqres.in" / "api" / "login" withEntity jsonObject(
  //     "email" ~> "morpheus@nebuchadnezzar"
  //   )

  // // Do not touch this, just uncomment it.
  // executeInSequence(
  //   getRequest1,
  //   getRequest2,
  //   getRequest3,
  //   postRequest1,
  //   postRequest2,
  //   postRequest3
  // )
end exercise2
