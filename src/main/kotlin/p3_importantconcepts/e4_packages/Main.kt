import java.lang.Math.*

//import java.lang.Math.PI
//import java.lang.Math.PI

//import constant.aritmethic.*
//import p3_importantconcepts.e4_packages.constant.strings.APP_NAME

//import constant.aritmethic.EULER
//import constant.aritmethic.PI

//import constant.aritmethic.EULER
//import constant.aritmethic.PI

/* Paket ve İmport Kavramı
* Javada oldugu gibi Kotlin'dede kodları namespace(alanAdı) olarak
* kullanmak için paketleri(package) kullanabiliriz.

* Paketlerin Temel Amacı:Kodlarımızı Hiyerarşik ve daha düzenli olarak tutulmasını sağlamaktır.
* Programımızda yapacağımız işlemleri işlevlerine göre paketleyebiliriz.
  ÖR:veritabanı bağlantıları,network istekleri vb olabilir */

/*TEKNIK TANIM:

 EX: com.kayrapp.network.response

 com     : Java tabanlı dillerde bu ifade ortak olarak bulunur.
           Sistem bunu kendisi oluşturur.
           Bir Klasörü temsil eder.

 kayrapp : İsim alanımızdır vermek istedigimiz isimi yazabiliriz.

 network : Alt Klasör ismidir.
           Bu package de ağ ile ilgili işlemler yer almaktadır.
           Başka klasörlerde olabilir. database,network,common

 response : network klasöründe bulunan işlerin bölündüğü bir alt klasördür.
           network modülü farklı şekillerde bölünebilir ör: request,response etc.*/

/*IMPORT KAVRAMI
*
* Uygulamamızda varolan paketleri eklemek için kullanılır.
* İmport ile package içerisinde bulunan:
    - Class(Sınıf)
    - Metot(Fonksiyon)
    - Interface(Arayüz)  gibi yapılara erişilerek kullanılabiliriz.

*KULLANIM:

1- Paket içeriğini komple dahil etme:
    import packageUzantısı.*

2- Paket içerisinden sadece istenileni dahil etme:
    import packageUzantısı.kullanılmakIstenen
* */

fun main(args: Array<String>) {

    // println("PI Sayımız:$PI")
    // println("PI Sayımız:$EULER")
    // println("APP Name:$APP_NAME")

    println("PI Sayımız:$PI")
    println("E Sayımız:$E")
}