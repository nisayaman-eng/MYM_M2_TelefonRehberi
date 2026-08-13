package ortak

import ders1.cizgiCek

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

// sepeteUrunEkle: Parametre olarak esnek bir liste (MutableList<String>) alsın.
// Kullanıcıdan 3 farklı ürün ismini sırayla isteyip listeye eklesin.

fun sepeteUrunEkle(urunListesi: MutableList<String>) {
    for (i in 1..3) {
        print("Ürün ismini girin: ")
        val urun = readln().trim().lowercase()

        if (urun.isNotEmpty()) urunListesi.add(urun)


    }
}


//2. urunSorgula: Aynı listeyi parametre olarak alsın. Kullanıcıdan aramak istediği bir ürün adı isteyin. Eğer ürün listede varsa kaçıncı sırada olduğunu ekrana yazdırsın. Yoksa kullanıcıyı uyararak ürünü listenin en başına ekleyip sepetin son halini ekrana bassın.
fun urunSorgula(urunlerListesi: MutableList<String>) {
    print("Aramak istediğiniz ürünü girin: ")
    val arananUrun = readln().trim().lowercase()


    if (urunlerListesi.contains(arananUrun)) {
        val sira = urunlerListesi.indexOf(arananUrun)
        println("Mevcut ürün indexi: $sira")
    } else {
        println("Ürün sepetinizde bulunamadı: $arananUrun, listenin başına ekleniyor...")
        urunlerListesi.add(0, arananUrun)

        println("Yeni ürün listesi: $urunlerListesi")
    }
}

fun plakaDogrula(gecerliPlakalar: List<Int>) {
    print("Plaka kodunu girin: ")
    val plaka = readln().toIntOrNull()

    if (plaka == null) {
        println("Geçerli bir sayısal bir plaka kodu girin!")
    } else {
        if (gecerliPlakalar.contains(plaka)) {
            println("Onaylandı, sistemimiz bu şehri destekliyor.")
        } else {
            println("Desteklenmeyen plaka kodu")
        }
    }


}

fun menuyuGoster() {
    println(
        """
      
        --- TELEFON REHBERİ ---
        1. Kişi Ekle
        2. Kişi Bul
        3. Tüm Rehberi Listele
        4. Çıkış
    """.trimIndent()
    )
    print("Seçiminiz: ")
}

fun isimFormatla(isim: String): String {
    val trimliIsim = isim.trim().lowercase()
    return trimliIsim
}

fun kisiEkle(rehber: MutableMap<String, String>) {
    print("Eklenecek kişinin adı: ")
    var kisiAdi = readln()
    kisiAdi = isimFormatla(kisiAdi)
    print("Telefon Numarası: ")
    val numara = readln().trim()


    if (kisiAdi.isEmpty() || numara.isEmpty()) {
        println("Hata: İsim veya telefon numarası boş bırakılamaz!")
    } else {
        val buyukIsim = kisiAdi.replaceFirstChar { it.uppercase() }

        if (rehber.containsKey(kisiAdi)) {
            println("$buyukIsim zaten kayıtlıydı.Numarası güncellendi")
        } else {
            println("$buyukIsim rehbere eklendi")
        }

        rehber[kisiAdi] = numara

    }

}

fun kisiBul(rehber: Map<String, String>) {
    println("Kimin numarasını arıyorsunuz?: ")
    var arananKisi = readln()
    arananKisi = isimFormatla(arananKisi)

    if (arananKisi.isEmpty()) {
        println(" Hata: Arama yapabilmek için bir isim girmelisiniz!")
    } else {

        if (rehber.containsKey(arananKisi)) {
            val numara = rehber[arananKisi]
            println("Sonuç:${arananKisi.replaceFirstChar { it.uppercase() }} = $numara")
        } else {
            println("Hata: Kişi bulunamadı!")
        }

    }

}

fun rehberiListele(rehber: Map<String, String>) {

    if (rehber.isEmpty()) {
        println("Uyarı: Rehberiniz henüz boş. İlk önce kişi ekleyin!")
    } else {
        println("\n--- KAYITLI KİŞİLER ---")
        for ((kisi, numara) in rehber) {
            println("${kisi.replaceFirstChar { it.uppercase() }} -> $numara")
        }
        cizgiCek()

    }

}


