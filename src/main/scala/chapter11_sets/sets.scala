package chapter11_sets

object sets {
  // Sets in scala is similar to all the other languages and its immutable by default
  val set1: Set[Int] = Set(1, 2, 2, 4, 4, 5, 7);

  // if we want to declare mutable set we can do it like so
  var set2: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set[Int](3, 1, 2, 4);

  def main(args: Array[String]): Unit = {
    // since set is immutable the code below will although print all the numbers but the set itself won't change
    println(set1 + 4);

    // Here this code doesn't index the set but it just checks whether or not the given value is present in the set or not
    println(set1(2));
    println(set1.head);
    println(set1.tail);
    println(set1.isEmpty);

    // To concatenate the set
    println(set1 ++ set2);
    println(set1.++(set2));

    // To find intersection of two sets
    println(set1.&(set2));
    println(set1.intersect(set2));
  }
}
