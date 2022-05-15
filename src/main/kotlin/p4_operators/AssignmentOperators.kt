/*2- Atama Operatörleri - Assignment Operators

Değişkenimize bir değer atanmasını sağlayan veya bir değişkendeki değeri
başka bir değişkene atamamızı sağlayan operatör tipimizdir.

=	Değişkenimize değer atamamıza yarar. Sağdan sola atanır. Basit atama operatörüdür.
+= 	Örnek:		a+=b 	ile 	a=a+b
-= 	Örnek: 	a-=b  	ile 	a=a-b
*=	Örnek: 	a*=b	ile 	a=a*b
/=	Örnek: 	a/=b	ile 	a=a/b
%=	Örnek: 	a%=b	ile 	a=a%b   */

fun main() {
    val name="Orçun"

    var num1=5
    var num2=10

    //num1=num1+num2
    //num1+=num2

    //num1= num1-num2
    //num1-=num2

    //num1=num1*num2
    //num1*=num2

    println(num1)

    //num2/=num1

    num2%=num1
    println(num2)
}