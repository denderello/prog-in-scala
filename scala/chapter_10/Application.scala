import Spiral.spiral

object Application extends App {  
  val nSides = args(0).toInt

  println(spiral(nSides, 0))
}
