import foo.{Element, ArrayElement,LineElement,UniformElement}

object Application extends App {  
  val elem: Element = new ArrayElement(Array("hello", "world"))
  val lineElem: ArrayElement = new LineElement("hello world")
  val uniformElem: Element = new UniformElement('d', 50, 10)
  
  println(elem.width)
  println(lineElem.width)
  println(uniformElem.width)
}