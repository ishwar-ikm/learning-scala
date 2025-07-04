package chapter18_inheritance

class Triangle(base: Double, height: Double) extends Polygon {
  override def area: Double = {
    0.5 * base * height;
  }
}
