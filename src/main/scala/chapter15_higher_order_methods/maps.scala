package chapter15_higher_order_methods

object maps {
  val lst: List[Int] = List(1, 2, 3, 4);
  val map: Map[Int, String] = Map(1 -> "ishwar", 2 -> "mishra");

  def main(args: Array[String]): Unit = {
    // Map in scala is same as JS
    println(lst.map(x => x * 2));

    // If we use map method over Map data structure we will get Tuple for x
    println(map.map(x => x));

    // we can use mapValues to map over values
    println(map.mapValues(x => "hi " + x));

    // If there are nested lists we can use flatten method to flatten it up
    println(List(List(3, 12, 3, 34), List(5, 2, 7, 3)).flatten);

    // flatMap can be used to map over the iterable and then flatten it up
    println(lst.flatMap(x => List(x, x*2)));
  }
}
