package ders3.alistirmalar

import ortak.plakaDogrula

fun main() {
    /*
    ortak paketinizde plakaDogrula adında bir fonksiyon oluşturun.
    Bu fonksiyon parametre olarak sadece okunabilir
     bir liste (List<Int>) alsın.
Fonksiyonun içinde: Kullanıcıdan aramak istediği plaka kodunu
 konsoldan isteyin ve girdiyi çökme korumalı hale getirin.
  Eğer girilen plaka parametre olarak gelen korumalı listenin içindeyse
   ekrana “Sistemimiz bu şehri desteklemektedir” yazdırın,
    aksi halde “Desteklenmeyen plaka!” uyarısı verin. main bloğu içinde
      Türkiye’nin ilk 4 şehrini içeren (1, 2, 3, 4) sabit bir liste (listOf) oluşturup bu fonksiyonu çağırarak test edin.
     */
    val desteklenenPlakalar = listOf(1, 2, 3, 4)

    plakaDogrula(desteklenenPlakalar)


}

