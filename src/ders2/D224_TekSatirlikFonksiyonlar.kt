package ders2

fun main() {

    var sayininKaresi = kareHesapla(5)
    println(sayininKaresi)

    sayininKaresi = kareAlKisa(6)
    println(sayininKaresi)
}

fun kareHesapla(sayi: Int): Int {
    return sayi * sayi
}

// eğer bir fonksiyon sadece tek bir mantıksal ifadeden veya matematiksel işlemden oluşuyorsa, süslü parantezleri ve return tipini ve kelimesini tamamen kaldırabiliriz.
fun kareAlKisa(sayi: Int) = sayi * sayi