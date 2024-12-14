# Java-ITP-W6-S10-PF-Polymorphism

Kelas Introduction to Programming / Week 6 / Session 10

### Penjelasan:
**Main.java**

Metode `add(String, String)` dipanggil jika kedua argumen adalah `String`.  
Metode `add(String, int)` dipanggil jika argumen pertama `String `dan kedua `int`.  
Pemilihan metode dilakukan saat kompilasi berdasarkan tipe parameter.

**Main2.java**

Superclass: `Kendaraan` memiliki metode `infoMobil()`.  
Subclass: `MobilFortuner` dan `MobilYaris` meng-override metode `infoMobil()` dengan implementasi masing-masing.  
Referensi Kendaraan digunakan untuk memanggil metode `infoMobil()` pada objek `MobilFortuner` dan `MobilYaris`.  
Metode `infoMobil()` yang dipanggil bukanlah metode milik `Kendaraan`, melainkan metode yang di-override pada subclass (`MobilFortuner` atau `MobilYaris`). Pemilihan metode yang dipanggil dilakukan saat runtime, tergantung pada objek aktual yang direferensikan.

Sekian.

Habib Azizul Haq  
(2702488253)
