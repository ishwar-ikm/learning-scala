package chapter19_lazy_evaluation

class Strict {
  val num = {
    println("Strict eval");
    9;
  }
}

class Lazy_eval {
  lazy val num = {
    println("Lazy eval");
    9;
  }
}

// Lazy evaluations can only evaluated only after its first use
object lazy_evaluation {
  def main(args: Array[String]): Unit = {
    val x = new Strict();
    val y = new Lazy_eval();

    println(x.num);
    println(y.num);
  }
}
