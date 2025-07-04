package chapter20_traits

class Triangle(base: Double, height: Double) extends Polygon with Shape {
  override def area: Double = {
    0.5 * base * height;
  }

  def color: String = "Red";
}
