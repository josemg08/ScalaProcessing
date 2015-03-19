import processing.core._

/**
 * Created by Jose Gonzalez on 19/03/15.
 */

class Test extends PApplet {

  var tamano = 0;

  override def setup() = {
    size(300,300)
    noFill()
    stroke(255,0,0)
  }

  override def draw: Unit = {
    background(0);
    var i = 0;
    for(i <- 5 to 25 by 10) {
      ellipse(150, 150, tamano + i, tamano + i)
    }
    tamano = tamano + 1
    if(tamano > 80){
      tamano = 1
    }
  }

}