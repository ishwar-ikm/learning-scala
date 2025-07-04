package chapter14_options

object options {
  // options are of two types some or none
  val lst1: List[Int] = List(1, 2, 3, 4);
  val map1: Map[Int, String] = Map(1 -> "ishwar", 2 -> "mishra");

  // We can even define options like so
  val opt1: Option[Int] = Some(22);
  val opt2: Option[Int] = None;

  def main(args: Array[String]): Unit = {
    // here the find function will either return some or none based on whether the element is present or not
    println(lst1.find(_ > 9)); // Returns none
    println(lst1.find(_ > 2)); // Return some(3)

    println(map1.get(1));
    println(map1.get(4));

    // if we want to extract the value from some() then we can use get
    println(lst1.find(_ > 2).get); // Return some(3)

    // If it returns none then get will throw error so we can use getOrElse
    println(lst1.find(_ > 9).getOrElse("Not found")); // Returns none


    println(opt1);
    println(opt2);
  }
}
