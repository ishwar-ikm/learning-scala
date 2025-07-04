package chapter18_inheritance

class Polygon {
  def area: Double = 0.0;
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var poly: Polygon = new Polygon();
    var rect: Rectangle = new Rectangle(21, 64);
    var tri: Triangle = new Triangle(21, 64);

    printArea(tri);
  }

  def printArea(obj: Polygon): Unit = {
    println(obj.area);
  }
}
