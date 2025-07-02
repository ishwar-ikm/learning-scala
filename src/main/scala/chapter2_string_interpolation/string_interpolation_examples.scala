package chapter2_string_interpolation

object string_interpolation_examples {
  def main(args: Array[String]): Unit = {
    val name: String = "Ishwar";
    val age: Int = 22;

    // Normal string concatenation
    println(name + " is " + age + " years old.");

    // s String interpolation (Type unsafe)
    println(s"$name is $age years old.");

    // f String interpolation (Type safe)
    println(f"$name%s is $age%d years old.");

    // escape sequence
    println(s"Hello \nworld");

    // row string
    println(raw"Hello \nworld");
  }
}
