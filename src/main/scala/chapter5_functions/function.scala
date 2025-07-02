package chapter5_functions

object function {
  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  // Return keyword can be avoided since in scala the last line is usually returned
  def subtract(x: Int, y: Int): Int = {
    x - y;
  }

  // If there is only one line in the function it can be written like so
  def multiply(x: Int, y: Int): Int = x * y;

  // If we are certain that the return statement will always be of certain type we can avoid type annotation as well but not recommended
  def divide(x: Int, y: Int) = x / y;

  // Lets create a function inside an object and then use it
  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    // We can define default parameters same as other languages
    def subtract(x: Int = 40, y: Int = 10): Int = {
      return x - y;
    }

    // If the function doesn't return anything then we can use Unit as their return type
    def print_number(num: Int): Unit = {
      println(num);
    }

    def square(x: Int): Int = x*x;
  }

  // Note: + - * or any symbol is a valid function name and it doesn't represent operator overloading in case of scala
  // even when we do 4 + 2 in scala here '+' is again a function which takes a single argument

  def main(args: Array[String]): Unit = {
    println(add(45, 24));
    println(subtract(45, 24));
    println(multiply(45, 24));
    println(divide(45, 15));

    // Calling the function from object
    println(Math.add(45, 15));
    println(Math.square(15));
    println(Math.subtract());
    println(Math.print_number(3));

    // If the function only takes one argument we can call that function like so
    println(Math square 12);

    // We can declare anonymous functions as well in scala which is similar to javascript
    // Here String => Unit means the function will take String as input and return void
    val greet: String => Unit = (name: String) => {
      println("Hello " + name);
    }
  }
}
