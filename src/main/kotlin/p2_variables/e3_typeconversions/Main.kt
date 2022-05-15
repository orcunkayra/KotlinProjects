package p2_variables.e3_typeconversions

/* #### Tür Dönüştürme (Type Conversion) ####

- Tür dönüştürme, bir veri türünün değerini başka bir veri türüne dönüştürme işlemidir.
- Sayısal bir veri türünü başka bir türe dönüştürmek için:
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
    toString()
- Kotlin'de sayısal tür dönüştürme, Java'dan farklıdır .
- Java'dan farklı olarak Kotlin, daha küçük türlerden daha büyük türlere
  örtük(implicit) dönüştürmeyi desteklemez.*/
fun main(args: Array<String>) {
//    val x1:Int=127
//    val x2:Long= x1.toLong()

//    val numberInt:Int=127
//    println(numberInt)
//
//    val numberShort:Short=numberInt.toShort()
//    println(numberShort)
//
//    val numberByte:Byte= numberInt.toByte()
//    println(numberByte)

//    val numberFloat:Float=128.6F
//    val numberInt2:Int= numberFloat.roundToInt()
//    val numberInt3:Int= numberFloat.toInt()
//    println(numberInt2)
//    println(numberInt3)

//    val letter:Char='a'
//    val stringVariable:String= letter.toString()
//    println(stringVariable)


//    val stringVariable2:String="Bu Bir Stringdir."
//    val charVariable:Char=stringVariable2

//    val numberChar3:Char='3'
//    val numberVariable:Int= numberChar3.toInt()
//    println(numberVariable)


    val phoneNumber: String = "5440000000"
    println(phoneNumber)
    println(phoneNumber.length)

    val phoneNumberLong: Long = phoneNumber.toLong()
    println(phoneNumberLong)
//    println(phoneNumberLong)
}