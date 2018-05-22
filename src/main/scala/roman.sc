import RomanNumerals.stringToListInt

val b = List(5,6,3,2)
val c = b.tail
val d = List(0)
val e = c :::d
val f = b zip e

val g = f map { t => if (t._1 >= t._2) t._1 else -t._1 }
val h  = g.sum





def romanToInt(input:String):Int = {
  val a = stringToListInt(input)
  val b = a.tail.toList
  val c = List(0)
  val d = b:::c
  val e = b zip d
  val f = e map { t => if (t._1 >= t._2) t._1 else -t._1 }
  f.sum
}
}

