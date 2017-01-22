/**
  * Created by Kate on 1/22/2017.
  */
object TwelveDays extends App{
  println("What day of Christmas is it?")
  val input = scala.io.StdIn.readLine()

  println("Total gift count: " + computeTotalGiftcount(input.toInt,0))

    def computeTotalGiftcount(dayOfChristmas: Int, currentTotalGiftCount: Int) : Int = {
      if (dayOfChristmas == 0) currentTotalGiftCount
      else computeTotalGiftcount(dayOfChristmas - 1, currentTotalGiftCount + sumDown(dayOfChristmas))
    }

  def sumDown(num: Int) : Int ={
    if(num == 0) return num
    num + sumDown(num -1)
  }
}
