package chapter16_reduce_fold_scan

object reduce {
  val lst1: List[Int] = List(2, 1, 5, 12, 54, 324, 1, 432);
  val lst2: List[String] = List("Hello", "Hi", "Bye");

  def main(args: Array[String]): Unit = {
    // Reduce are of two types reduceLeft and reduceRight
    // It takes any binary operator and performs that binary operation
    // from left to right and right to left vice versa

    println(lst1.reduceLeft(_ - _));
    println(lst2.reduceLeft(_ + _));

    println(lst1.reduceRight(_ - _));
    println(lst2.reduceRight(_ + _));
  }
}
