package com.hitx.learn.basics

object StringOps {

  val aString: String = "Hello, I am learning Scala"

  // string functions
  val secondChar = aString.charAt(1)
  val firstWord = aString.substring(0, 5) // "Hello"
  val words = aString.split(" ") // Array("Hello,", "I", "am", "learning", "Scala")
  val startsWithHello = aString.startsWith("Hello") // true
  val allDashes = aString.replace(' ', '-')
  val allUppercase = aString.toUpperCase() // also toLowerCase()
  val nChars = aString.length

  // other functions
  val reversed = aString.reverse
  val aBunchOfChars = aString.take(10)

  // parse to numeric
  val numberAsString = "2"
  val number = numberAsString.toInt

  // s-interpolation/ s-String
  val name = "Alice"
  val age = 12
  val greeting = "Hello, I'm " + name + " and I am " + age + "years old."
  val greeting_v2 = s"Hello, I'm $name and I'm $age years old."
  val greeting_v3 = s"Hello, I'm $name and I will be turning ${age + 1} years old."

  // multiline
  println(
    s"""name: "$name",
       |age: $age""".stripMargin)

  //escape chars
  println(s"New offers starting at $$14.99") //$
  println(s"""{"name":"James"}""") // ""

  // f-interpolation/ formatting
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.5f burgers per minute."
  println(myth)

  // raw-interpolation
  val escapes: String = raw"This is a \n newline"
  print(escapes)

  def main(args: Array[String]): Unit = {
    println(escapes)
  }
}
