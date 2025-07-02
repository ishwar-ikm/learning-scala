package chapter4_loops

object while_loop {
  def main(args: Array[String]): Unit = {
    var i: Int = 0;

    while(i < 10) {
      println("i = " + i);
      i += 1; // We can not use i++ or i-- in scala
    }
  }
}
