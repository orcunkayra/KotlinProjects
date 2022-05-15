/*3- Karşılaştırma Operatörleri -Comparison Operators
Değişken veya verilerimiz arasında karşılaştırma yapmamızı sağlayan operatörlerdir.
<	Küçüktür (Less than)
>	Büyüktür (Greater than)
<=	Küçük Eşittir (Less than or equal to)
>=	Büyük Eşittir (Greater than or equal to)
==	Eşit midir ? (Equal to)
!=	Eşit değil midir ?(Not equal) */

fun main() {
    val num1=7
    val num2=4

//    println(num1>num2)
//    println(num1>=num2)
//    println(num1<num2)
//    println(num1<=num2)
//    println(num1==num2)
//    println(num1!=num2)

    print("Şifre:")
    val pass1= readLine()

    print("Şifre2:")
    val pass2= readLine()

    println("Şifreler Eşitmi:${pass1==pass2}")
    println("Şifreler Eşitmi:${pass1!=pass2}")

}