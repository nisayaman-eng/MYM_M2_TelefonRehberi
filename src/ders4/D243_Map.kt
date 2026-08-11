package ders4

import ders1.cizgiCek

fun main() {
    val sinavNotlari = mutableMapOf<String, Int>()
    sinavNotlari["Matematik"] = 100
    sinavNotlari["Fizik"] = 80
    sinavNotlari["Türkçe"] = 78

    sinavNotlari["Türkçe"] = 85
    println(sinavNotlari["Trkçe"])//null

    println(sinavNotlari)

    val notlar = sinavNotlari.values
    println(notlar)
    cizgiCek()

    for ((key, value) in sinavNotlari){
        println("Ders Adı: $key, Notu: $value")
    }

    val sehirPlakalari = mapOf(
        "İstanbul" to "34",
        "Zonguldak" to "67",
        "Ankara" to "06"
    )



}