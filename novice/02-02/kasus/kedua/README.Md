# penjelasan kasus ini menggunakan generic

Singkatnya, generik mengaktifkan tipe kelas dan antarmuka menjadi parameter saat mendefinisikan kelas, antarmuka, dan metode. Sama seperti parameter formal yang lebih dikenal yang digunakan dalam deklarasi metode, parameter tipe menyediakan cara bagi Anda untuk menggunakan kembali kode yang sama dengan input berbeda. Perbedaannya adalah bahwa input ke parameter formal adalah nilai, sedangkan input untuk parameter tipe adalah tipe.

Kode yang menggunakan obat generik memiliki banyak keunggulan dibandingkan kode non-generik:

Pemeriksaan jenis yang lebih kuat pada waktu kompilasi.
Kompiler Java menerapkan pemeriksaan tipe yang kuat ke kode generik dan mengeluarkan kesalahan jika kode tersebut melanggar keamanan tipe. Memperbaiki kesalahan waktu kompilasi lebih mudah daripada memperbaiki kesalahan waktu proses, yang mungkin sulit ditemukan.
