package ders2.alistirmalar

import ortak.daireAlanHesapla

/*
Kullanıcıdan bir yarıçap (Int) değeri isteyin
ve girdiyi çökme korumalı hale getirin.
Dairenin alanını (3.14 * r * r) hesaplayıp geriye ondalıklı (Double) olarak
 döndüren bir fonksiyon yazın.
 Bu fonksiyonu süslü parantez veya return anahtar kelimesi kullanmadan,
  tamamen tek satırda (Single Expression) tasarlayın.
 */

fun main() {
    print("Yarıçap girin: ")
    val yaricap = readln().toIntOrNull() ?: 0

    println(daireAlanHesapla(yaricap))





}
