package chapter8_strings

// Strings in scala is same as java and uses the same string class from java
object strings {
  val str1 = "Hi, I am Ishwar";
  val str2 = "I am learning scala";

  val int_num = 21;
  val float_num = 31.32;

  def main(args: Array[String]): Unit = {
    println(str1.length());
    println(str1.concat(str2));
    // concatenation can be done by using + as well
    println(str1 + str2);

    // String formatting
    printf("%d, %f, %s\n", int_num, float_num, str2);
    println("%d, %f, %s".format(int_num, float_num, str2))
  }
}
