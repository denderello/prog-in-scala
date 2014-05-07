object ListAnalyzer {
  def containsNeg(numbers: List[Int]): Boolean = {
    var exists = false
    
    for (number <- numbers) {
      if (number < 0) {
        exists = true
      }
    }
    
    exists
  }
  
  def containsNegOptimized(numbers: List[Int]): Boolean = {
    numbers.exists(_ < 0)
  }
  
  def containsOdd(numbers: List[Int]): Boolean = {
    var exists = false
    
    for(number <- numbers) {
      if (number % 2 == 1) {
        exists = true
      }
    }
    
    exists
  }
  
  def containsOddOptimized(numbers: List[Int]): Boolean = {
    numbers.exists(_ % 2 == 1)
  }
}