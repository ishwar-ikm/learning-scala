package chapter18_inheritance

class Rectangle(length: Double, width: Double) extends Polygon {
  override def area: Double = {
    length*width;
  }
}
