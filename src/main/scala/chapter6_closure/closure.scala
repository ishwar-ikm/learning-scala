package chapter6_closure

// Closures are just a function which uses one or more variables which are described
// outside of the function scope. It will always take the latest modified value of the variable.
object closure {
  val number: Int = 30;

  def add(num: Int): Int = {
    num + number
  }

  def main(args: Array[String]): Unit = {
    println(add(41));
  }
}
