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

  override def draw() {
  }

  override def mousePressed() = {
    point(mouseX, mouseY)
    //drawCircle(mouseX, mouseY)

    val length = 20
    val angleJump = Math.PI / 6
    var angle = 0.0
    var circleX = 0.0
    var circleY = 0.0

    //.___ Go through all angles from 0 to 2 * PI radians __./
    while (angle < 2 * Math.PI) {
      //.___ calculate x, y from a vector with known length and angle __./
      circleX = length * Math.cos(angle)
      circleY = length * Math.sin(angle)

      point((mouseX+circleX).toInt, (mouseY+circleY).toInt)
      angle += angleJump
    }
  }

  /*def drawCircle(x : Int, y : Int) = {
    val length = 20
    val angleJump = 0.3
    var angle = 0
    var circleX = 0.0
    var circleY = 0.0

    //.___ Go through all angles from 0 to 2 * PI radians __./
    while (angle < 2 * Math.PI) {
      //.___ calculate x, y from a vector with known length and angle __./
      circleX = length * Math.cos(angle)
      circleY = length * Math.sin(angle)

      point(x+circleX, y+circleY)
      angle += angleJump
    }
  }*/

}