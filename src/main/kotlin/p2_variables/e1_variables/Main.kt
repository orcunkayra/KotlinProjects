package p2_variables.e1_variables
/*---Değişkenler(Variables)---
* Değişken Nedir ?
    - Verilerle Çalışmamızı sağlayan sembolik ifadelerdir
* Değişkenlerin Çalışma Mantığı ?
* Değişken Tanımlama Şekilleri ?
    - var keyword --> Değişebilenler
        - Değişken tipi "belirtilmemiş" / "belirtilmiş"
    - val keyword --> Sabitler/Değişmeyenler
        Java -> "final" |  C  -> "const" | Kotlin -> "val"
* Değişken Tanımlama Sırası?
* NOT:Kotlinde tanımlamadaki sıralama diğer dillerden farklıdır.
    Javada -> veri tipi  + değişken adı
    Kotlinde -> değişkenin adı + veri tipi */

fun main(arg: Array<String>) {
    //##### var keyword ######
    //######Değişken tipi "belirtilmişse"######
    /* var name:String
     name="Ahmet"
     println(name)

     var age:Int
     age=23
     println(age)

     name="Orçun"
     print(name)*/

   //###### Değişken tipi "belirtilmemiş"######
   /* var name = "Ahmet"
    println(name)
    name = "Kayra"
    print(name)*/

    //##### val keyword ######
    //######Değişken tipi "belirtilmişse"######
    val PI_: Float
    PI_ = 3.17F
    print(PI_)
    // PI_ = 4.20
    // print(PI_)

    //###### Değişken tipi "belirtilmemiş"######
    val PI = 3.17F
    print(PI)
}