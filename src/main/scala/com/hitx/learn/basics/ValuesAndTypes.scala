package com.hitx.learn.basics

import scala.reflect.ClassManifestFactory.Nothing
import scala.runtime.Nothing$

object ValuesAndTypes {

  // Any is the supertype of all types, also called the top type
  val topType: Any = 5

  // Nothing is a subtype of all types, also called the bottom type
  val bottomType = Nothing

  // values & variables
  val luckyNumber: Int = 786 // const int meaningOfLife = 42
  // var luckyNumber: Int = 786

  // val reassigning is not allowed
  //luckyNumber = 45

  // type inference
  val anInteger = -67 // : Int is optional

  // common types
  val earthIsRound: Boolean = true

  val aShort: Short = 5263 // 2 Bytes or -32,768 to 32,767

  val anInt: Int = 78 // 4 Bytes or -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31-1, inclusive)
  val aFloat: Float = 2.4f // 4 bytes or 1.40129846432481707e-45 to 3.40282346638528860e+38

  val aLong: Long = 52789572389234L // 8 bytes or -2^63 to 2^63-1, inclusive
  val aDouble: Double = 3.14 // 8 bytes or 64-bit IEEE 754 double-precision float
  // 4.94065645841246544e-324 to 1.79769313486231570e+308

  // string & char
  val aChar: Char = 'a' // 16-bit unsigned Unicode character (0 to 2^16-1, inclusive)0 to 65535
  val aString: String = "Scala"

  // Precision Arithmetic
  val a = BigInt(1_234_567_890_987_654_321L)
  val b = BigDecimal(123_456.789)

  private val multiLineQuote :String ="""The essence of Scala:
                Fusion of functional and object-oriented
                programming in a typed setting."""


  private val multiLineQuoteWithoutTabs : String = """The essence of Scala:
      |Fusion of functional and object-oriented
      |programming in a typed setting.""".stripMargin



  def main(args: Array[String]): Unit = {
    println(multiLineQuote)
    println(multiLineQuoteWithoutTabs)
  }
}
