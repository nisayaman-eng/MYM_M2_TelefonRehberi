package ortak

fun uygulamayaGiris(kullaniciAdi: String, cihazTipi: String = "Mobil") {
    println("Hoş geldin $kullaniciAdi! ($cihazTipi üzerinden bağlandın)")
}


fun sepetimiHesapla(urunFiyati: Double, KDVOrani: Double = 0.18, kargoUcreti: Double = 29.90): Double {
    val KDVliFiyat = urunFiyati + (urunFiyati * KDVOrani)
    return KDVliFiyat + kargoUcreti
}


fun daireAlanHesapla(yaricap: Int) = 3.14 * yaricap * yaricap


fun sistemUyarisi(mesaj: String, hataMi: Boolean = false, hataKod: Int = 404) {
    val durumMetni = if (hataMi) "Hata" else "Bilgi Metni"

    println("$durumMetni $hataKod $mesaj")
}

fun kareHesapla(sayi: Int) = sayi * sayi


fun hipotenusKaresiHesapla(a: Int, b: Int): Int {
    val aninKaresi = kareHesapla(a)
    val bninKaresi = kareHesapla(b)

    return aninKaresi + bninKaresi
}