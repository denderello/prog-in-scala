import foo.{ArrayElement,LineElement}

object Application extends App {  
  val elem = new ArrayElement(Array("hello", "world"))
  val lineElem = new LineElement("hello world")
  
  println(elem.width)
  println(lineElem.width)
}