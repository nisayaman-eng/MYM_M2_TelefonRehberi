package ders2

fun main() {
    profilOlustur("Nisa Nur", "Yaman", bultenAboneligi = true)

    //Çok fazla parametre varsa parantezin üstüne gelip mavi yazıya dokun
    profilOlustur(
        ad = "Nisa Nur",
        soyad = "Yaman",
        bultenAboneligi = true,
        yas = 21
    )


}

fun profilOlustur(ad: String, soyad: String, yas: Int = 18, bultenAboneligi: Boolean = false) {
    println("Kullanıcı: $ad $soyad, Yaş: $yas, Bülten Aboneliği: $bultenAboneligi")
}