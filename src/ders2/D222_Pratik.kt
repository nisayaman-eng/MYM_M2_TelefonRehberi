package ders2

fun main() {
    /*uygulamayaGiris adında bir fonksiyon oluşturun.
Bu fonksiyon kullaniciAdi (String) ve cihazTipi (String) olmak üzere iki parametre alsın.
cihazTipi parametresine “Mobil” şeklinde bir varsayılan (default) değer atayın.
Fonksiyon içinde “Hoş geldin [kullaniciAdi]! ([cihazTipi] üzerinden bağlandın)” metnini yazdırın.
main bloğu içinde fonksiyonu önce sadece isminizle çağırın. Ardından hem isminizi hem de “Web” cihaz tipini göndererek iki farklı çıktıyı gözlemleyin.
     */

    uygulamayaGiris("Nisa")
    uygulamayaGiris("Eymen", "Web")

}

fun uygulamayaGiris(kullaniciAdi: String, cihazTipi: String = "Mobil") {
    println("Hoş geldin $kullaniciAdi! ($cihazTipi üzerinden bağlandın)")
}