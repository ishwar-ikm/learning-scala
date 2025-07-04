package chapter20_traits

class Rectangle(length: Double, width: Double) extends Polygon with Shape {
  override def area: Double = {
    length*width;
  }

  override def color: String = "Blue";
}
