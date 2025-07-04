package chapter17_classes

/*
if the member variables are var then can access it as it is using objects
if the member variables are val then can access it but can not write it
if the member variables are none of them and empty then we can't do either

private public can be defined in scala as well
 */

class User(private var age: Int, val name: String){
  // We use auxiliary constructor to define more constructors apart from primary constructor
  // This is default constructor
  def this() {
    // This will call primary constructor
    this(26, "Mishra");
  }

  // constructor with one parameter
  def this(name: String) {
    this(26, name);
  }

  def printInfo(): Unit = {
    println("Name: " + name + ", age: " + age)
  };
};

object classes {
  def main(args: Array[String]): Unit = {
    val user1 = new User(22, "Ishwar");
    val user2 = new User("Ishwar");
    val user3 = new User();

    user1.printInfo();
    user2.printInfo();
    user3.printInfo();
  }
}
