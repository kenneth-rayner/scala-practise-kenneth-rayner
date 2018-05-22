object RomanNumerals extends App {


  def convert(input: String): Int = {
    val stringToChars = input.toList


    input match {
      case "I" => 1
      case "X" => 10
      case "C" => 100
      case "M" => 1000
      case "V" => 5
      case "VII" => 7
      case "L" => 50
      case "D" => 500
    }
  }

  def convertLonger(input: String): List[Char] = {
    input.toList

  }

  def stringToListInt(input: String): Seq[Int] = {

    for (c <- input) yield {
      c match {
        case 'I' => 1
        case 'X' => 10
        case 'C' => 100
        case 'M' => 1000
        case 'V' => 5
        case 'L' => 50
        case 'D' => 500
      }
    }
  }

      def romanToInt(input:String):Int = {
        stringToListInt(input).sum
      }

  def romanToInt2(input:String):Int = {
    val a = stringToListInt(input)
    val b = a.tail.toList
    val c = List(0)
    val d = b:::c
    val e = a zip d
    val f = e map { t => if (t._1 >= t._2) t._1 else -t._1 }
    f.sum
  }
}



