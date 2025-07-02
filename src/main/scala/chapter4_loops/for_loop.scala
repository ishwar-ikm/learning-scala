package chapter4_loops

object for_loop {
  def main(args: Array[String]): Unit = {
    // For loop in a given range
    for(i <- 1 to 5) { // <- is called generator and to is a method in Int class which can also be used as 1.to(5)
      println("i using to = " + i);
    }

    for(i <- 1 until 6) {
      println("i using until = " + i);
    }

    // We can use multiple ranges in a single statement which will behave like a nested for loop
    for(i <- 1 to 3; j <- 1 to 2){
      println("value of i and j using multiple range = " + i + " " + j);
    }

    // For to iterate over a list
    val lst: List[Int] = List(1, 2, 3, 4, 5, 6);

    for(i <- lst) {
      println("value of lst = " + i);
    }

    // we can use conditional statement in the for loop to filter out the values
    for(i <- lst; if i%2 == 0) {
      println("even number in lst using filters = " + i);
    }

    // for loops as expression
    val result: List[Int] = for{i <- lst; if i%2 == 0} yield {
      i * i;
    }
    println("square of even numbers in list = " + result)
  }
}
