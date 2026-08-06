package ders2.alistirmalar

import ortak.hipotenusKaresiHesapla
import ortak.kareHesapla

fun main() {
    //Kullanıcıdan bir dik üçgenin iki dik kenar uzunluğunu
// (a ve b) tam sayı olarak isteyin
// ve girdileri çökme korumalı hale getirin.
// Bir sayının karesini alan tek satırlık (Single Expression)
// bir kareHesapla fonksiyonu yazın.
// Ardından dik kenarları parametre alan bir hipotenusKaresiHesapla fonksiyonu tasarlayın.
// Bu ikinci fonksiyon kenarların karelerini hesaplamak yerine,
// önceden yazdığınız karesini alma fonksiyonunu çağırarak işlemleri yapmalı
// ve iki karenin toplamını döndürmelidir.

    print("Bir dik üçgenin birinci ilk kenarını girin: ")
    val kenarA = readln().toIntOrNull() ?: 0

    print("Bir dik üçgenin birinci ikinci kenarını girin: ")
    val kenarB = readln().toIntOrNull() ?: 0

    val hipotenusKare = hipotenusKaresiHesapla(kenarA, kenarB)
    println(hipotenusKare)
}