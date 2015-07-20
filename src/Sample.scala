import processing.core._

/**.___
 * Created by Jose Gonzalez on 19/03/15.
 __.*/

class Sample extends PApplet {

  var mSize = 0

  override def setup() = {
    size(300,300)
    noFill()
    stroke(255,0,0)
  }

  override def draw(): Unit = {
    background(0)
    for(i <- 5 to 25 by 10) {
      ellipse(150, 150, mSize + i, mSize + i)
    }
    mSize = mSize + 1
    if(mSize > 80){
      mSize = 1
    }
  }

}