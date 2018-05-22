import org.scalatest._


class RomanNumeralsSpec extends WordSpec with MustMatchers {

  "RomanNumerals" must {

//    "return correct arabic number when the Roman Numeral is input" in {
//      RomanNumerals.convert("I") mustEqual 1
//    }
//
//    "return a list of separate chars from a string" in {
//
//      RomanNumerals.convertLonger("II") mustEqual List('I', 'I')
//    }
//    "return a list of separate chars from a string of 3 chars" in {
//
//      RomanNumerals.convertLonger("III") mustEqual List('I', 'I', 'I')
//    }

    "return a list of Arabic nums when input is a String of Roman Numerals" in {
      RomanNumerals.stringToListInt("II") mustEqual List(1, 1)
    }
    "return a list of Arabic nums when input is a String of 3 Roman Numerals" in {
      RomanNumerals.stringToListInt("III") mustEqual List(1, 1, 1)
    }
    "return a list of Arabic nums when input is a String of 3 different Roman Numerals" in {
      RomanNumerals.stringToListInt("VII") mustEqual List(5, 1, 1)
    }
//    "return a string of Roman numerals as an Int" in {
//      RomanNumerals.romanToInt("II") mustEqual 2
//    }
//    "return a string of Roman3 different numerals as an Int" in {
//      RomanNumerals.romanToInt("XVI") mustEqual 16
//    }

    "return a string of 3 Roman numerals as an Int" in {
      RomanNumerals.romanToInt("III") mustEqual 3
    }
    "return a string of 3new Roman numerals as an Int" in {
      RomanNumerals.romanToInt("XVI") mustEqual 16
    }
    "return a string of 3newer Roman numerals as an Int" in {
      RomanNumerals.romanToInt("XIV") mustEqual 14
    }
    "return a string of 9 Roman numerals as an Int" in {
      RomanNumerals.romanToInt("MCMLXXXIV") mustEqual 1984
    }
    "return a string of 8 Roman numerals as an Int" in {
      RomanNumerals.romanToInt("LXXXVIII") mustEqual 88
    }
  }
}
