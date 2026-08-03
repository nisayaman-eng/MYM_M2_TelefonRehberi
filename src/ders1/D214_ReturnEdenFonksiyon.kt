package ders1

fun main() {

    print("Doğum yılınızı giriniz: ")
    val dogumYili = readln().toInt()

    val yas = yasHesapla(dogumYili)
    println("Yaşını: $yas")

    if (yas < 18 ) {
        println("Ehliyet alabilirisniz")
    }else{
        println("Ehliyet alamazsınız")
    }
}

fun yasHesapla(dogumYili: Int): Int {

    return 2026 - dogumYili
}