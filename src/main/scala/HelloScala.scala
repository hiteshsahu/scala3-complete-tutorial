
import scala.io.StdIn.readLine

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Please enter your name:")
    val name = readLine()
    println("Hello, " + name + "!")
  }
}
