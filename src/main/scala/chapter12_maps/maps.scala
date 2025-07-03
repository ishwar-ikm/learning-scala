package chapter12_maps

object maps {
  val map1: Map[Int, String] = Map(1 -> "Ishwar", 2 -> "Mishra");

  def main(args: Array[String]): Unit = {
    println(map1);
    println(map1(1));
    println(map1.keys);
    println(map1.values);
    println(map1.isEmpty);

    // Syntax to iterate over a map
    map1.keys.foreach({key =>
      println(f"Key: $key -> Value: ${map1(key)}")
    })

    // to check if the given key is present or not
    println(map1.contains(2));
  }
}
