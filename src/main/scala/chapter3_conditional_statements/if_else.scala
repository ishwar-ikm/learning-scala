package chapter3_conditional_statements

object if_else {
  def main(args: Array[String]): Unit = {
    val num: Int = 22;
    var res: String = "";

    if(num%2 == 1){
      res = "odd";
    } else {
      res = "even";
    }
    println(res);

    // if else expression
    val res2: String = if(num%2 == 1) "odd" else "even";
    println(res2);
  }
}
