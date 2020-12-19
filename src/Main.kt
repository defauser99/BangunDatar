/**
 * Program ini dibuat untuk menghitung luas dan keliling dari berbagai bangun datar.
 * Pengguna memasukkan nama bangun, pilihan rumus, dan ukuran yang diperlukan, dan
 * program akan secara otomatis menghitung luas dan kelilingnya.
 */
fun main() {
    // Header
    println("Selamat datang di kalkulator bangun datar")
    println("Dibuat oleh: Defa Ihsan Ramadhan")
    repeat(41) {print("=")}

    /**
     * Kondisi di bawah ini memberikan pengguna fasilitas
     * untuk berulang-kali menggunakan program ini selama memilih "Y"
     * dan bisa keluar dari program dengan memilih "N".
     */
    do {
        print("\nMasukkan nama bangun yang mau diukur: ")

        when(readLine()?.toLowerCase()!!) {
            "lingkaran" -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")
                val pilihan = readLine() ?: "3"
                print("Masukkan ukuran diameter (cm): ")
                val diameter = readLine()?.toDoubleOrNull() ?: 0.0

                // Output
                when(pilihan) {
                    in arrayOf("1","1.") -> run { rumusLingkaran(diameter, luas = true) }
                    in arrayOf("2","2.") -> run { rumusLingkaran(diameter, keliling = true) }
                    else -> run { rumusLingkaran(diameter, luas = true, keliling = true) }
                }
            }

            in arrayOf(
                "persegi", "bujursangkar", "bujur sangkar",
                "bujur-sangkar", "bujur_sangkar"
            ) -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")
                val pilihan = readLine() ?: "3"
                print("Masukkan ukuran sisi (cm): ")
                val sisi = readLine()?.toDoubleOrNull() ?: 0.0

                // Output
                when(pilihan) {
                    in arrayOf("1","1.") -> run { rumusPersegi(null, sisi, sisi, luas = true) }
                    in arrayOf("2","2.") -> run { rumusPersegi(null, sisi, sisi, keliling = true) }
                    else -> run { rumusPersegi(null, sisi, sisi, luas = true, keliling = true) }
                }
            }

            in arrayOf(
                "persegipanjang", "persegi panjang", "persegi-panjang",
                "persegi_panjang"
            ) -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")
                val pilihan = readLine() ?: "3"
                print("Masukkan ukuran panjang (cm): ")
                val panjang = readLine()?.toDoubleOrNull() ?: 0.0
                print("Masukkan ukuran lebar (cm): ")
                val lebar = readLine()?.toDoubleOrNull() ?: 0.0

                // Output
                when(pilihan) {
                    in arrayOf("1","1.") -> run { rumusPersegi(true, panjang, lebar, luas = true) }
                    in arrayOf("2","2.") -> run { rumusPersegi(true, panjang, lebar, keliling = true) }
                    else -> run { rumusPersegi(true, panjang, lebar, luas  = true, keliling = true) }
                }
            }

            in arrayOf(
                "segitiga", "segi tiga", "segi-tiga",
                "segi_tiga"
            ) -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")
                val pilihan = readLine() ?: "3"
                print("Masukkan ukuran alas (cm): ")
                val alas = readLine()?.toDoubleOrNull() ?: 0.0

                // Output
                when(pilihan) {
                    in arrayOf("1","1.") -> {
                        // Additional Input
                        print("Masukkan ukuran tinggi (cm): ")
                        val tinggi = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusSegitiga(alas, tinggi, luas = true) }
                    }
                    in arrayOf("2","2.") -> {
                        // Additional Input
                        print("Masukkan ukuran sisi kiri (cm): ")
                        val sisiKiri = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi kanan (cm): ")
                        val sisiKanan = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusSegitiga(alas, sisiKiri = sisiKiri, sisiKanan = sisiKanan, keliling = true) }
                    }
                    else -> {
                        // Additional Input
                        print("Masukkan ukuran tinggi (cm): ")
                        val tinggi = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi kiri (cm): ")
                        val sisiKiri = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi kanan (cm): ")
                        val sisiKanan = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusSegitiga(alas, tinggi, sisiKiri, sisiKanan, luas = true, keliling = true) }
                    }

                }
            }

            in arrayOf(
                "belahketupat", "belah ketupat", "belah-ketupat",
                "belah_ketupat"
            ) -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")

                // Output
                when(readLine() ?: "3") {
                    in arrayOf("1","1.") -> {
                        // Additional Input
                        print("Masukkan ukuran diagonal 1 (cm): ")
                        val diagonal1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran diagonal 2 (cm): ")
                        val diagonal2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(null, diagonal1 = diagonal1,
                            diagonal2 = diagonal2, luas = true) }
                    }
                    in arrayOf("2","2.") -> {
                        // Additional Input
                        print("Masukkan ukuran sisi 1 (cm): ")
                        val sisi1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 2 (cm): ")
                        val sisi2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(null, sisi1 = sisi1,
                            sisi2 = sisi2, keliling = true) }
                    }
                    else -> {
                        // Additional Input
                        print("Masukkan ukuran diagonal 1 (cm): ")
                        val diagonal1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran diagonal 2 (cm): ")
                        val diagonal2 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 1 (cm): ")
                        val sisi1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 2 (cm): ")
                        val sisi2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(null, sisi1 = sisi1,
                            sisi2 = sisi2, diagonal1 = diagonal1, diagonal2 = diagonal2,
                            luas = true, keliling = true) }
                    }
                }
            }

            in arrayOf(
                "layanglayang", "layang layang", "layang-layang",
                "layang_layang", "layang2", "layang"
            ) -> {
                // Input
                println("Pilih ukuran yang mau dihitung")
                print("1. Luas, 2. Keliling, 3. Keduanya, pilihan: ")

                // Output
                when(readLine() ?: "3") {
                    in arrayOf("1","1.") -> {
                        // Additional Input
                        print("Masukkan ukuran diagonal 1 (cm): ")
                        val diagonal1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran diagonal 2 (cm): ")
                        val diagonal2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(true, diagonal1 = diagonal1,
                            diagonal2 = diagonal2, luas = true) }
                    }
                    in arrayOf("2","2.") -> {
                        // Additional Input
                        print("Masukkan ukuran sisi 1 (cm): ")
                        val sisi1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 2 (cm): ")
                        val sisi2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(true, sisi1 = sisi1,
                            sisi2 = sisi2, keliling = true) }
                    }
                    else -> {
                        // Additional Input
                        print("Masukkan ukuran diagonal 1 (cm): ")
                        val diagonal1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran diagonal 2 (cm): ")
                        val diagonal2 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 1 (cm): ")
                        val sisi1 = readLine()?.toDoubleOrNull() ?: 0.0
                        print("Masukkan ukuran sisi 2 (cm): ")
                        val sisi2 = readLine()?.toDoubleOrNull() ?: 0.0

                        // Output
                        run { rumusBelahKetupat(true, sisi1 = sisi1,
                            sisi2 = sisi2, diagonal1 = diagonal1, diagonal2 = diagonal2,
                            luas = true, keliling = true) }
                    }
                }
            }

            else -> println("Bangun tidak ada!")
        }

        // "Y" untuk gunakan program lagi
        print("\nUkur bangun lagi? (Y/N): ")
        val ukurLagi = readLine()?.toUpperCase()!!
        if (ukurLagi == "N") println("Terimakasih")

    } while(ukurLagi == "Y")
}