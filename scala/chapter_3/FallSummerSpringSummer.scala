import ChecksumAccumulator.calculate

object FallSummerSpringSummer extends App {

  for(season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}