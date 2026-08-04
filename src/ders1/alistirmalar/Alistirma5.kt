package ders1.alistirmalar

fun main() {
    /* Adım Adım Kare Hesaplama (Döngü Entegrasyonu):
     Kullanıcıdan bir sınır sayısı (Int) isteyin
     (çökme koruması uygulayın).
      Geriye gönderilen sayının karesini hesaplayıp döndüren
      bir fonksiyon tasarlayın.
      Ana programda (main) 1’den kullanıcının girdiği sınır sayısına kadar
      dönen bir for döngüsü kurun ve döngünün her adımında bu fonksiyonu çağırarak sayıların karelerini ekrana listeyin.
     */

    println("Sınır sayısı girin: ")
    val sinirSayisi = readln().toIntOrNull() ?: 5

    for (i in 1..sinirSayisi){
        val kareDegeri = kareAl(i)
        println("$i²= $kareDegeri")

    }

}

fun kareAl(sayi: Int): Int {
    return sayi * sayi
}