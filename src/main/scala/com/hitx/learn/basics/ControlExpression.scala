package com.hitx.learn.basics

object ControlExpression {

  /**
   * if / then / else
   * for loops
   * while loops
   * try / catch / finally
   */

  def maxNumber(a:Int, b:Int): Int ={
    if a > b then
      println(s"$a is bigger than $b")
      a
    else if a == b then
      println(s"$a is equals to $b")
      a
    else
      println(s"$b is bigger than $a")
      b
  }

  private def printSequence(n: Int, m: Int) ={
    for
      i <- n to m
     do
      println(i)
  }

  // Multiple generators
  private def printRange( n:Int, m: Int) ={
    for
      i <- n to m
      j <- n+5 to m+5
    do
    println(s" i = $i & j = $j")

  }

  def main(args: Array[String]): Unit = {
    // for do
    printSequence(10,15)
    printRange(1,5)
    
    // If  then else
    println(maxNumber(10, -59))
    println(maxNumber(-1010, -59))
    println(maxNumber(5, 5))
  }
}
