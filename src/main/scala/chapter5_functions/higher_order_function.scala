package chapter5_functions

object higher_order_function {

  def math_operation(x: Double, y: Double, func: (Double, Double) => Double): Double = {
    func(x, y);
  }

  def main(args: Array[String]): Unit = {
    var addition = math_operation(21, 43, (x: Double, y: Double) => x + y);
    println(addition);

    var subtraction = math_operation(21, 43, (x: Double, y: Double) => x - y);
    println(subtraction);

    var minimum = math_operation(21, 43, (x: Double, y: Double) => x min y);
    println(minimum);

    var maximum = math_operation(21, 43, (x: Double, y: Double) => x max y);
    println(maximum);
  }
}
