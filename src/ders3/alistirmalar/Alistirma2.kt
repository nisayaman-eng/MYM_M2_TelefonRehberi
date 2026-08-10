package ders3.alistirmalar

/*
Bir çekiliş uygulaması tasarlıyorsunuz.
Kullanıcıdan konsol üzerinden sırayla 4 farklı katılımcı ismi girmesini isteyin.
 Katılımcıların tamamı listeye eklendiğinde; önce listenin sırasını rastgele karıştırın
 , ardından bu listeden rastgele bir şanslı kazanan seçip ekrana yazdırın.
  Toplam katılımcı sayısını da ekranda gösterin.
 */
fun main() {

    val katilimcilar = mutableListOf<String>()

    for (i in 1..4) {
        print("$i. katılımcıyı girin: ")
        val katilimci = readln().trim().uppercase()

        if (katilimci.isNotEmpty()) katilimcilar.add(katilimci)

    }

    if (katilimcilar.isNotEmpty()) {
        katilimcilar.shuffle()
        val kazananKatilimci = katilimcilar.random()

        println("toplam katılımcı sayısı: ${katilimcilar.size} ")
        println("Tebrikler şanslı kazanan: $kazananKatilimci")
    } else {
        println("Liste boş!")
    }


}




