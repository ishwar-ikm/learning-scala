package chapter10_Lists

import chapter9_Arrays.arrays.{arr1, arr2}

// Lists are similar to Arrays the only difference is that array is mutable where are lists are not
// Also the underlying data structure in case of lists are linked list
object lists {
  // This syntax is not valid in list since its immutable
  // val list1: List[Int] = new List[Int](4);

  val list1: List[Int] = List(3, 1, 6, 3);
  val list2: List[String] = List("Hi", "how", "are", "you");

  def main(args: Array[String]): Unit = {
    for (x <- list1) println(x);
    for (x <- list2) println(x);

    // List is immutable but we can still append or prepend in it with changing the actual list like so
    println(2 :: 4 :: list1 :: 43 :: Nil);

    // again there are various methods available for list similar to array
    println(list1.head);
    println(list1.tail);
    println(list1.isEmpty);
  }
}
