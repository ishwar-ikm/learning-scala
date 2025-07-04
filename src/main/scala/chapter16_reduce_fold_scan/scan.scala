package chapter16_reduce_fold_scan

object scan {
  val lst1: List[Int] = List(2, 1, 5, 12, 54, 324, 1, 432);
  val lst2: List[String] = List("Hello", "Hi", "Bye");

  def main(args: Array[String]): Unit = {
    // Scan will return the intermediate results as well

    println(lst1.scanLeft(1000)(_ - _));
    println(lst2.scanLeft("z")(_ + _));

    println(lst1.scanRight(1000)(_ - _));
    println(lst2.scanRight("z")(_ + _));
  }
}
