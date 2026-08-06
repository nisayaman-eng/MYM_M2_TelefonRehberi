package ders2.alistirmalar

import ortak.sepetimiHesapla

fun main() {
    //Görev 1’de oluşturduğunuz sepetHesapla fonksiyonunu kullanacağız.
// Kullanıcıdan ürün fiyatını ve “Ücretsiz Kargo” kuponu olup olmadığını (E/H şeklinde) konsoldan isteyin.
// Eğer kullanıcının ücretsiz kargo kuponu varsa, fonksiyonu çağırırken kargo ücretini 0.0 olarak ezmek istiyorsunuz.
// Ancak KDV oranına hiç dokunmayıp varsayılan değerinde (0.18) kalmasını sağlamalısınız. Bunu aradaki parametreyi atlayacak şekilde isimlendirilmiş argüman
// (Named Argument) kullanarak gerçekleştirin.

    print("Satın aldığınız ürünün fiyatını ondalıklı olarak girin: ")
    val fiyat = readln().toDoubleOrNull() ?: 0.0

    print("Ücretsiz kargo kuponunuz var mı? (E/H): ")
    val kuponVarMi = readln().trim().uppercase() == "E"

    val toplamTutar = if (kuponVarMi) {
        sepetimiHesapla(fiyat, kargoUcreti = 0.0)
    }else{
        sepetimiHesapla(fiyat)
    }

    println(toplamTutar)


}
