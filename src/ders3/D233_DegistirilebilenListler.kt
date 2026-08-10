package ders3

fun main() {
    val alisVerisDepeti = mutableListOf<String>()
    alisVerisDepeti.add("Kalem")
    alisVerisDepeti.add("Defter")
    alisVerisDepeti.add("Silgi")

    println("Alışveriş sepeti : $alisVerisDepeti")

    alisVerisDepeti.add(1, "Çanta")
    println("Alışveriş sepeti : $alisVerisDepeti")

    alisVerisDepeti.shuffle()
    println("Karışık Alışveriş sepeti : $alisVerisDepeti")

    alisVerisDepeti.removeAt(2)
    println("Alışveriş sepeti : $alisVerisDepeti")

    println(alisVerisDepeti.remove("Çanta"))
    println("Alışveriş sepeti : $alisVerisDepeti")

    /*println(alisVerisDepeti.removeAt(5))
    println("Alışveriş sepeti : $alisVerisDepeti")*/

    alisVerisDepeti.clear()
    println("Alışveriş sepeti : $alisVerisDepeti")




}

