package chapter3_conditional_statements

object match_case {
  def main(args: Array[String]): Unit = {
    val num: Int = 21;

    num%2 match {
      case 1 => println("odd");
      case 2 => println("even");
      case _ => println("default");
    }

    // match as an expression
    val result: String = num % 2 match {
      case 1 => "odd";
      case 2 => "even";
      case _ => "default";
    }
    println(result);

    // multiple condition in case
    val ingredient: String = "tomato";

    ingredient match {
      case "tomato" | "mango" | "lychee" => println("fruit");
      case "onion" | "potato" | "pumpkin" => println("vegetable");
      case _ => println("some other ingredient");
    }
  }
}
