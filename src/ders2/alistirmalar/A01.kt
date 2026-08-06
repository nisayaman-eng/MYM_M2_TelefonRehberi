package ders2.alistirmalar

import ortak.sepetimiHesapla

//Kullanıcıdan satın aldığı ürünün fiyatını konsol üzerinden
// ondalıklı sayı olarak isteyin.
// Girdinin geçersiz olması durumunda çökme koruması uygulayarak
// varsayılan bir ürün fiyatı belirleyin.
// Ardından sepetHesapla adında bir fonksiyon yazın.
// Bu fonksiyon ürün fiyatını, KDV oranını (varsayılan değeri 0.18)
// ve kargo ücretini (varsayılan değeri 29.90) parametre olarak alsın.
// Fonksiyon, ürünün KDV eklenmiş fiyatına kargo ücretini de yansıtarak
// toplam ödenecek tutarı hesaplayıp geriye döndürsün.

fun main() {
    print("Satın aldığınız ürünün fiyatını ondalıklı olarak girin: ")
    val fiyat = readln().toDoubleOrNull() ?: 0.0

    val sonuc = sepetimiHesapla(fiyat)

    println("$sonuc TL")



}