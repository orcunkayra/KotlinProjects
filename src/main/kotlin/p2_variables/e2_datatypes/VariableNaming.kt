package p2_variables.e2_datatypes

/* #### Değişkenler İsimlendirme Kuralları ####
-	Değişkene içerdiği değerlerle alakalı isimler verilmeli.
-	İlk karakter herhangi bir rakam veya sayı ile başlamamalı.
-	Değişken isimleri alt çizgi "_" ile başlayabilir.
-	Değişken isimlerinde Türkçe karakter kullanılmamalı.
-	İki kelimeden oluşan değişken isimlerinin arasına boşluk konulmamalı.
-	Kotlin dilinde büyük küçük harf duyarlılığı mevcuttur.
-	Özel karakterler değişken isimlerinde kullanmayınız. @,#,%,&…
-	Matematiksel işaretler ve programlamaya ait komut ve deyimler değişken isimlerinde kullanmayınız.*/

fun main(args: Array<String>) {
    // Değişkene içerdiği değerlerle alakalı isimler verilmeli.
    val username = "Orçun"
    val phoneNumber = "05000000000"

    // İlk karakter herhangi bir rakam veya sayı ile başlamamalı.
    // val 1number =1234

    // Değişken isimleri alt çizgi "_" ile başlayabilir.
    val _name = "Orçun"

    // Değişken isimlerinde Türkçe karakter kullanılmamalı.
    // ç, ş, ğ ,ı vs.
    // val değişkenAdı = "asdasd"  //yanlıs
    val degiskenAdi = "asdasd"  //dogru
    val nameSurname = "Orçun Kayra" //dogru

    // İki kelimeden oluşan değişken isimlerinin arasına boşluk konulmamalı.
    //val name surname = "Orçun Kayra" //yanlış
    //val nameSurname = "Orçun Kayra" //dogru

    // Kotlin dilinde büyük küçük harf duyarlılığı mevcuttur.
    //Örnek1
    val COMPANY_NAME = "AbcSoft"
    val company_name = "DsaSoft"
    println(COMPANY_NAME)
    println(company_name)

    //örnek2
    // val company_name = "AbcSoft"
    // val Company_name= "DsaSoft"
    // println(company_name)
    // println(Company_name)

    // Özel karakterler değişken isimlerinde kullanmayınız. @,#,%,&…
    // val @name = "Orçun" //yanlış
    // val name# = "Orçun" //yanlış
    // val name% = "Orçun" //yanlış

    //Matematiksel işaretler ve programlamaya ait komut ve deyimler değişken isimlerinde kullanmayınız.
    // val +surname = "Kayra" //yanlış
    // val *surname = "Kayra" //yanlış
    // val /surname = "Kayra" //yanlış
    val xSurname = "Kayra" //dogru
}