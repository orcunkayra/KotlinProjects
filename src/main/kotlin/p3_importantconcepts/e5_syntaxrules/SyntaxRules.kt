package p3_importantconcepts.e5_syntaxrules

/* #### Kotlin İsimlendirme Standartları ####

NEDEN STANDARTLARIMIZ OLMALI ?
* Ortak Standartlar ile kodların diğer yazılımcılar tarafından okunabilirliği.
* Daha anlaşılır kod yazımı sağlar.
* Kod bakımına (maintenance) harcanan zamanı azaltır.*/

/*BÜYÜK HARF STANDARTLARI:
1-Proje isimleri:
    - Küçük ya da büyük harfle başlayabilir.Genellikle büyük harfle başlatılır.
    - LCC veya UCC kullanılır.

2-Sınıf isimleri:
    - Büyük harfle başlar küçük harfle devam eder. (UCC)
    – Class(Sınıf) adı dosya ismi ile aynı olmalı.

3- Sabitlerin tanımlaması:
    - Büyük Harflerle tanımlanmalı.
    - Eğer birden fazla kelimeden oluşuyorsa "_" ile ayırılabilir.*/

/*KÜÇÜK HARF STANDARTLARI:
1-Paket isimleri:
    - Küçük harfle başlar.
    - Paketlerini küçük harfle yaz ve tek ve tekil isimler verilmeli.

2-Değişken isimleri:
    - Küçük harfle başlar.
    – Eğer birden fazla kelimeden oluşuyorsa LCC kullanılabilir.

3- Metot/Fonksiyon isimleri:
    - Küçük harfle başlar.
    – Eğer birden fazla kelimeden oluşuyorsa LCC kullanılabilir.*/

/*EXTRA STANDARTLAR:
- İsimlendirmede daima “Camel Case” --> "loverCamelCase"(LCC) veya "UpperCamelCase"(UCC) kullan.
- Daima İngilizce isimler kullan.Hiçbir şekilde türkçe karakter kullanma. ç,ğ,ş,...
- Daima anlamlı isimler kullan; Uzun olsun ama anlamsız olmasın.
- Bilindik isimler kullan. Aynı şeyler için her yerde aynı ismi kullan.
- Kısaltmaları büyük harflerle yazma. getHTTP ->getHttp veya getXMLCode -> getXmlCode
- Kod yazarken parmakların sıklıkla format tuşlarında olsun.  "CTRL +ALT +L"
- Uzun satırları bir kaç satıra yay ki yatay kaydırmaya (scroll) ihtiyaç kalmasın.*/

fun sumVariable() {
    val num1 = 10
    val num2 = 12

    println("Toplama:${num1 + num2} \n " +
            "Toplama:${num1 + num2} \n " +
            "Toplama:${num1 + num2} \n " +
            "Toplama:${num1 + num2} \n " +
            "Toplama:${num1 + num2}")
}

fun main() {
    val PI = 3.14F
    val APP_NAME = "ASDF Uygulaması"

    val nameSurname = "Orçun Kayra"   //LCC
    sumVariable()
}

