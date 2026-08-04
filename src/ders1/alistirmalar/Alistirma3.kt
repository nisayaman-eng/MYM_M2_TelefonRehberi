package ders1.alistirmalar

fun main() {
    /* Dikdörtgen Alan Hesaplayıcı (Güvenli double):
    Kullanıcıdan dikdörtgenin iki kenar uzunluğunu konsoldan isteyin.
    Girdilerin sayısal olmama durumunu kontrol ederek yedek birer kenar değeri atayın. Kenarları alan ve alanı hesaplayıp geriye (Double) döndüren bir fonksiyon yazın. Sonucu ana programda yazdırın.

     */
    print("Kısa kenar uzunluğunu girin: ")
    val kisaKenar = readln().toDoubleOrNull() ?:1.0

    print("Uzun kenar uzunluğunu girin: ")
    val uzunKenar = readln().toDoubleOrNull() ?:1.0

    val alan = alanHesapla(kisaKenar, uzunKenar)
    println("Dikdörtgenin alanı: $alan")


}
fun alanHesapla(kenar1: Double, kenar2: Double): Double {
    return kenar1 * kenar2
}