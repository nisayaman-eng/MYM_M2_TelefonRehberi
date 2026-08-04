package ders1.alistirmalar

fun main() {
    /* Oyuncu Skor Kartı (Parametreli):
    Kullanıcıdan oyuncu adını ve kazandığı puanı konsoldan isteyin.
     Girilen puanın harf veya boş olması durumunda
     çökmesini engelleyerek varsayılan bir puan atayın.
     Ardından bu bilgileri parametre olarak alan ve ekrana şık bir skor tablosu yazdıran bir fonksiyon tasarlayın.
     */
    print("Adınızı giriniz: ")
    val ad = readln().trim()

    val oyuncuAdi = if (ad.isEmpty()) "Misafir Oyuncu" else ad

    print("Skorunuzu giriniz: ")
    val skor = readln().toIntOrNull() ?: 0

    skorTablosuYazdir(oyuncuAdi, skor)






}
