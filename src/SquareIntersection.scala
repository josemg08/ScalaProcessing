import processing.core.PApplet

/*.___
 * Created by jose-gonzalez on 20/07/15.
 __.*/

class SquareIntersection extends PApplet {

  var mSize = 0

  override def setup() = {
    size(500,300)
    stroke(255)
    strokeWeight(10)
    background(0)
  }

  override def draw(): Unit = {
  }

  override def mousePressed(): Unit = {
    point(mouseX, mouseY)
  }

}