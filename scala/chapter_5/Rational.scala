class Rational (n: Int, d: Int) {
  require(d != 0)
  
  private val g = greatestCommonDivisor(n.abs, d.abs)
  
  val numerator: Int = n / g
  val denominator: Int = d / g
  
  def this(n: Int) = this(n, 1)
  
  override def toString = numerator + "/" + denominator
  
  def + (that: Rational): Rational = 
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )
    
  def + (i: Int): Rational =
    new Rational(numerator + i * denominator, denominator)
  
  def * (that: Rational): Rational =
    new Rational(numerator * that.numerator, denominator * that.denominator)
  
  def greatestCommonDivisor(a: Int, b: Int): Int =
    if (b == 0) a else greatestCommonDivisor(b, a % b)
}