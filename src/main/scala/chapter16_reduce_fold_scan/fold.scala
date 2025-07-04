package chapter16_reduce_fold_scan

object fold {
  val lst1: List[Int] = List(2, 1, 5, 12, 54, 324, 1, 432);
  val lst2: List[String] = List("Hello", "Hi", "Bye");

  def main(args: Array[String]): Unit = {
    // Fold is same as reduce the only difference is it takes one initial value as well before performing the binary operation

    println(lst1.foldLeft(1000)(_ - _));
    println(lst2.foldLeft("Initial Value")(_ + _));

    println(lst1.foldRight(1000)(_ - _));
    println(lst2.foldRight("Initial Value")(_ + _));
  }
}
