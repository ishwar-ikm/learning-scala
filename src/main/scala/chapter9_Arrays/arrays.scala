package chapter9_Arrays

import Array._
import scala.collection.mutable.ArrayBuffer

object arrays {
  // Ways to declare an Array
  val arr1: Array[Int] = new Array[Int](4);
  val arr2: Array[String] = Array("Hi", "how", "are", "you");

  def main(args: Array[String]): Unit = {
    // Indexing of array in scala is different from other languages
    arr1(0) = 21;
    arr1(1) = 32;
    arr1(2) = 71;
    arr1(3) = 27;

    for(x <- arr1) println(x);
    for(x <- arr2) println(x);

    // There are various methods available for array to be used
    println(arr1.length);

    println("-------");

    // Array with variable lengths can be defined using array buffer
    val arr3: ArrayBuffer[Int] = ArrayBuffer[Int]();
    arr3 += 43;
    arr3 += 13;
    for(x <- arr3) println(x);

    arr3 ++= Array(4, 1, 5);
    for(x <- arr3) println(x);
  }
}
