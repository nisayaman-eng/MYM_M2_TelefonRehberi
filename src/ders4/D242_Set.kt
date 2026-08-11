package ders4

fun main() {

    val cekilisKatilimcilari = mutableSetOf<String>()

    cekilisKatilimcilari.add("Ahmet")
    cekilisKatilimcilari.add("Ayşe")
    cekilisKatilimcilari.add("Ali")
    cekilisKatilimcilari.add("Zeynep")
    cekilisKatilimcilari.add("Mehmet")

    cekilisKatilimcilari.add("Ayşe")
    cekilisKatilimcilari.add("Ayşe")

    println(cekilisKatilimcilari)


    val katilimciListesi = cekilisKatilimcilari.toList()
    println("Listenin İlk Elemanı: ${katilimciListesi[0]}")

    val ogrenciListesi = mutableListOf<String>()
    ogrenciListesi.add("Ali")
    ogrenciListesi.add("Ahmet")
    ogrenciListesi.add("Ayşe")
    ogrenciListesi.add("Ali")

    println("Öğrenci listesi: $ogrenciListesi")

    val ogrenciSet = ogrenciListesi.toSet()
    println("Öğrenci Seti: $ogrenciSet")



}