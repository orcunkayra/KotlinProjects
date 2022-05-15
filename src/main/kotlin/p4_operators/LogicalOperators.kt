/*4- Mantıksal Operatörler- Logical Operators
Program içerisinde mantıksal işlemler yapılmasını sağlayan operatörlerimizdir.
Mantıksal operatörler programlamada, Logic devrelerde vb kullanılmaktadır.

a) AND(&&)	    “VE OPERATÖRÜ - Logical and”
b) OR ( ||)		“VEYA OPERATÖRÜ - Logical or”
c) NOT(!) 		“DEĞİL OPERATÖRÜ -Logical not”
d) Artırma(++) Azaltma(--) Operatörleri:
e) in Operatörü

0 = False
1 = True
a) AND(&&)	“VE OPERATÖRÜ - Logical and”
0	0	0
0	1	0
1	0	0
1	1	1
NOT: 1 tane bile 0 varsa sonuç 0(false) olur.
----------------------------------------------
b) OR ( || )		“VEYA OPERATÖRÜ - Logical or”
0	0	0
0	1	1
1	0	1
1	1	1
NOT: 1 tane bile 1 varsa sonuç 1(True) olur.
-----------------------------------------------
c) NOT(!) 		“DEĞİL OPERATÖRÜ -Logical not”
0 = False ve  1 = True oldugunda:
!0 =1    -> !False =True
!1=0     -> !True = False

d) Artırma Azaltma Operatörleri:
++	Artırma(Increment) : Sayı veya Değişkenin değerini 1 ARTIRIR.
-- 	Azaltma (Decrement) : Sayı veya Değişkenin değerini 1 AZALTIR.

e) in Operatörü
Temel amacı bir değer veya karakterin belirtilen aralıkta olup olmadığını kontrol etmektir.
in ile yapılan işlemler sonuç olarak BOOLEAN bir değer döndürür.
    in 	İçinde
    !in	İçinde Değil */

fun main() {

/*
    val USERNAME = "orcunkayra"
    val PSW = "sifre_123"
    val EMAIL = "ok@hotmail.com"

    println("Kullanııcı adınız:")
    val username = readLine()

    println("Şifreniz:")
    val password = readLine()

    println("Epostanız:")
    val email = readLine()

    println("Login Durumu:${USERNAME == username && PSW == password}")
    println("Login Durumu:${USERNAME == username || EMAIL == email && PSW == password}")
*/

    val married = true
    println(!married)


    //Artırma(++) ve Azaltma(--)
/*    var num1 = 1000
    num1 = num1 + 1
    println(num1)

    num1 += 1
    println(num1)

    ++num1
    println(num1)*/

/*    var num2=2000
    num2=num2-1
    println(num2)

    num2-=1
    println(num2)

    println(--num2)*/


    // in Operatörü
    var zeroToTen = 0..10
    println("0 ile 10 arasındamı:${5 in zeroToTen}")
    println("0 ile 10 arasındamı:${5 !in zeroToTen}")
}