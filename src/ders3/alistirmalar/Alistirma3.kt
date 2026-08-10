package ders3.alistirmalar

fun main() {
    /*
    Kullanıcıdan konsol üzerinden sırayla 5 adet tam sayı isteyin. Girdilerin sayısal olmama durumunu kontrol ederek çökme koruması uygulayın ve bu sayıları sabit boyutlu boş bir tam sayı dizisine (Array) yerleştirin. Ardından bu diziyi küçükten büyüğe otomatik olarak sıralayarak ekrana yazdırın. Sonucu yazdırırken döngü kullanmadan, tek bir satırda yazdırın.
     */

    val sayilarlaListe = IntArray(5)

    for (i in 0 until sayilarlaListe.size) {
        print("${i + 1}. sayıyı girin: ")
        val kulluaniciSayi = readln().toIntOrNull() ?: 0

        sayilarlaListe[i] = kulluaniciSayi
    }

    sayilarlaListe.sort()
    println(sayilarlaListe.contentToString())


}