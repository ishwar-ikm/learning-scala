package chapter7_currying

/*
Currying is the technique of transforming a function with multiple arguments
to a function with single argument
 */
object curried_functions {
  // This here is a normal function
  def add(x: Int, y: Int): Int = {
    x + y;
  }

  // This is a curried function
  def add2(x: Int): Int => Int = {
    def inner_add(y: Int): Int = {
      x + y;
    }
    inner_add;
  }

  // There are multiple ways of writing the above function as given below
  // Using anonymous functions
  def add3(x: Int): Int => Int = {
    (y: Int) => x + y;
  }

  // Using scala curried syntax
  def add4(x: Int)(y: Int): Int = x + y;

  def main(args: Array[String]): Unit = {
    println(add(21, 12));
    println(add2(21)(12));
    println(add3(21)(12));
    println(add4(21)(12));
  }
}
