package chapter15_higher_order_methods

object filters {
  val lst: List[Int] = List(1, 2, 3, 4);

  def main(args: Array[String]): Unit = {
    // Again filters are also same as JS we provide it a predicate to filter a given iterable
    println(lst.filter(x => x%2 == 0));
  }
}
