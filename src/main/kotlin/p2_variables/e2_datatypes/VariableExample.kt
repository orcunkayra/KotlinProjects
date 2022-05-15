package p2_variables.e2_datatypes

/* #### Değişken Boyutları ve Kullanımları ####
Byte	    1 bayt	                -128, ..., 127
Short	    2 bayt	                -32768, ..., 32767
Int	        4 bayt	                -2147483648, ..., 2147483647
Long	    8 bayt	   L           -9223372036854775808, ..., 9223372036854775807
Float	    4 bayt	   F,f          ±1.5*10-45, ..., ±3.4*1038
Double	    8 bayt	   default      ±5.0*10-324, ..., ±1.7*10308
Char        2 bayt       ''         Tek bir Karakter Tutar.
String      Sınırsız  "" , """"""   Metin Tutar. */

/*Örnek:
Tutulmak istenen bilgiler:
- adı
- soyadı
- cinsiyet --> (k/e)
- boy
- yaş
- kardes sayısı
- adres
- bekar,evli --> true/false
- telefon
*/
fun main(args:Array<String>){
    val name = "Orçun"
    val surname= "Kayra"
    val gender = 'e'
    val height = 1.80F
    val age :Short = 70
    val siblingCount :Byte = 127
    val adress ="Abc mahallesi abb sokak 14/2"
    val married = true
    val phoneNumber= "5411111111"
}