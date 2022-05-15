/* #### Veri Tipleri (Data Type) ####
- Bellekte doğru şekilde alan ayrımı.

* Tam Sayılar / Number (Sayı) Veri Tipi
    - Int, Long(L), Short, Byte
* Ondalık Sayılar:
    - Double, Float(F)
* Mantıksal İfadeler:
    - Boolean(true/false)
* Metinsel İfadeler:
    - Char, String
-----------------------------------------------------------------------------
- Kotlinde herşey nesne olarak kabul edilir. Primitive veri tipleride dahil !
     Primitive Tipler: Number(Sayı), Boolean, Char, String
    - Kotlin'de -> "nesne/obje olarak" ifade edilir.
    - Java’da -> "nesne olmayarak yani primitive/ilkel tip olarak" ifade edilir.*/

fun main(arg: Array<String>) {
/*
    //int
    val numberInt : Int
    numberInt=12
    println(numberInt)
    println(Int.SIZE_BYTES)
    println(Int.SIZE_BITS)
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)

    //double
    val numberDouble : Double
    numberDouble=6.78

    //float
    val numberFloat:Float
    numberFloat=6.78F

    //Long
    val numberLong:Long
    numberLong=1234L

    //Byte
    val numberByte:Byte
    numberByte =120

    //Boolean
    val booleanVariable : Boolean
    booleanVariable=true
    print(booleanVariable)  //true

    //char
    val charVariable : Char
    charVariable='a'
*/
    //string
    val stringVariable: String
    val stringVariable2: String
    stringVariable = "Birinci String."
    stringVariable2 = """İkinci String"""

    println(stringVariable + " " + stringVariable2)  //Birinci String İkinci String
    println("$stringVariable $stringVariable2")  //Birinci String İkinci String
    println("$stringVariable ${stringVariable + stringVariable2}")

    val name: String
    name = "Orçun"

    val surname = "Kayra"
    val harf = 'k'
    val number = 13
    val numberDouble_ = 13.4
    val numberFloat_ = 13.4F
    val numberLong = 134L
    val booleanVariable_ = false
}