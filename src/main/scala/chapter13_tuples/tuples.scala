package chapter13_tuples

object tuples {
  // Tuples are immutable and can have multiple data types in a single tuple, it's also immutable
  val tup1: (Int, Double, String, Boolean) = (1, 2.4, "Hi", true);

  // Another way of declaring a tuple is
  val tup2: (Int, Double, String, Boolean) = Tuple4(1, 2.4, "Hi", true);

  def main(args: Array[String]): Unit = {
    println(tup1._1);
    println(tup1._2);

    // To iterate over a tuple
    tup1.productIterator.foreach({i =>
      println(i);
    })


  }
}
