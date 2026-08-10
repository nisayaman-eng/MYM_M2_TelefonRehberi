package ders3

fun main() {
    val zorlukSeviyeleri = listOf("Kolay", "Orta","Zor")
    println(zorlukSeviyeleri[0].uppercase())
    println(zorlukSeviyeleri)

    //zorlukSeviyeleri.add("efsanevi")// Hata: Ekleme yapılmaz
    //zorlukSeviyeleri[2] = "Efsanevi"//Hata: değer değiştirilemez

    println(zorlukSeviyeleri.isEmpty())




}