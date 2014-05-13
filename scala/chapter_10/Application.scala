import foo.{ArrayElement,LineElement,UniformElement}

object Application extends App {  
  val elem = new ArrayElement(Array("hello", "world"))
  val lineElem = new LineElement("hello world")
  val uniformElem = new UniformElement('d', 50, 10)
  
  println(elem.width)
  println(lineElem.width)
  println(uniformElem.width)
}