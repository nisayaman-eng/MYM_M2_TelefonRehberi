package ders2

import ders1.cizgiCek

fun main() {
    /*
    urunKaydet adında bir fonksiyon oluşturun ve sırasıyla id(Int), kategori(String), isim(String), fiyat(Double) parametrelerini almasını sağlayın. kategori parametresine “Genel” varsayılan değerini atayın.
main içerisinde bu fonksiyonu çağırın. Yukarıda öğrendiğiniz Ctrl + Space kısayolunu kullanarak parametre isimlerini IDE’den otomatik tamamlattırın.
Parametreleri gönderirken sırayı tamamen bozun: Önce fiyat, sonra id, en son da ismi Named Argument kullanarak gönderin. Kodun hatasız çalıştığını gözlemleyin.
     */

    urunKaydet(fiyat = 150.0, id = 1154, isim = "Defter")
    cizgiCek()
}

fun urunKaydet(id: Int, katagori: String = "Genel", isim: String, fiyat: Double) {
    println("Ürün Bilgisi: \nID: $id \nKATEGORİ: $katagori \nİSİM: $isim\nFiyat: $fiyat TL")
}