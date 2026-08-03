package ders1

fun main() {
    print("Bir km değeri girin: ")
    val km = readln().toDouble()

    val mil = kmToMil(km)
    println("$km km: ${"%.2f".format(mil)} mil' dir.")

}

fun kmToMil(km: Double): Double {
    return km * 0.62
}