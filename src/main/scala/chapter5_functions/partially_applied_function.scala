package chapter5_functions

import java.util.Date;

object partially_applied_function {

  def print_message(date: Date, message: String): Unit = {
      println(date + " " + message);
  }

  def main(args: Array[String]): Unit = {
    val date: Date = new Date;

    // This here is an example of a partially applied function where one function will pass some of the arguments
    // by default and the rest of the arguments are given by the caller
    val log: String => Unit = print_message(date, _: String);

    log("Hello world");
  }
}
