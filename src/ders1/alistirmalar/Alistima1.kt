package ders1.alistirmalar

fun main() {
    /*Görev 1 – Kişiselleştirilmiş Sistem Bilgisi (Parametreli):
 Kullanıcıdan konsol üzerinden ismini isteyin (boş bırakma ihtimaline karşı bir varsayılan isim atayın).
 Ardından bu ismi parametre olarak alan
 ve “Leader Bank” uygulamasının 2026 yılı telif hakkı kartını
 o isme özel olarak konsola basan bir fonksiyon yazın.
 */
    print("İsminizi girin: ")
    val isim = readln().trim()
    val varsayilanIsim = if (isim.isEmpty()) "Anonim" else isim

    println(telifHakkiYazdir(varsayilanIsim))

}

fun telifHakkiYazdir(isim: String?) {
    println("""
        Sayın: $isim
        | © 2026 Leader Bank A.Ş. Tüm Hakları Saklıdır.
        | Güvenliğiniz ve gizliliğiniz bizim için esastır.
    """.trimIndent())
}

