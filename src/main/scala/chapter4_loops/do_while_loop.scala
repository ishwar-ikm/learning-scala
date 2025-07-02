package chapter4_loops

object do_while_loop {
  def main(args: Array[String]): Unit = {
    var i: Int = 0;

    do {
      println("i = " + i);
      i += 1; // We can not use i++ or i-- in scala
    } while(i < 10);
  }
}
