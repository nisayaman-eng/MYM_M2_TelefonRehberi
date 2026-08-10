package ders3.alistirmalar

import ortak.sepeteUrunEkle
import ortak.urunSorgula

fun main() {
    /*
     sepeteUrunEkle: Parametre olarak esnek bir liste (MutableList<String>) alsın. Kullanıcıdan 3 farklı ürün ismini sırayla isteyip listeye eklesin.
2. urunSorgula: Aynı listeyi parametre olarak alsın. Kullanıcıdan aramak istediği bir ürün adı isteyin. Eğer ürün listede varsa kaçıncı sırada olduğunu ekrana yazdırsın. Yoksa kullanıcıyı uyararak ürünü listenin en başına ekleyip sepetin son halini ekrana bassın.
     */

    val urunListesi = mutableListOf<String>()
    sepeteUrunEkle(urunListesi)
    urunSorgula(urunListesi)


}