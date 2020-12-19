/**
 * Fungsi di bawah ini adalah fungsi lingkaran,
 * dengan parameter, rumus luas dan kelilingnya sendiri.
 */
fun rumusLingkaran(diameter: Double,
                   luas: Boolean = false,
                   keliling: Boolean = false) {

    fun luas(diameter: Double): Double {
        return 0.25 * kotlin.math.PI * diameter * diameter
    }

    fun keliling(diameter: Double): Double {
        return kotlin.math.PI * diameter
    }

    if (luas) {
        println("Luas lingkaran adalah: ${luas(diameter)} cm^2")
    }

    if (keliling) {
        println("Keliling lingkaran adalah: ${keliling(diameter)} cm")
    }
}

/**
 * Fungsi di bawah ini adalah fungsi persegi dan persegi panjang,
 * dengan parameter, rumus luas dan kelilingnya sendiri.
 */
fun rumusPersegi(persegiPanjang: Boolean?,
                 panjang: Double,
                 lebar: Double,
                 luas: Boolean = false,
                 keliling: Boolean = false) {

    fun luas(panjang: Double, lebar: Double): Double {
        return panjang * lebar
    }

    fun keliling(panjang: Double, lebar: Double): Double {
        return 2 * (panjang + lebar)
    }

    if (luas) {
        println("Luas ${persegiPanjang?.let {"persegi panjang"} ?: "persegi"} " +
                "adalah: ${luas(panjang, lebar)} cm^2")
    }

    if (keliling) {
        println("Keliling ${persegiPanjang?.let {"persegi panjang"} ?: "persegi"}" +
                " adalah: ${keliling(panjang, lebar)} cm")
    }
}

/**
 * Fungsi di bawah ini adalah fungsi segitiga,
 * dengan parameter, rumus luas dan kelilingnya sendiri.
 */
fun rumusSegitiga(alas: Double,
                  tinggi: Double = 0.0,
                  sisiKiri: Double = 0.0,
                  sisiKanan: Double = 0.0,
                  luas: Boolean = false,
                  keliling: Boolean = false) {

    fun luas(alas: Double, tinggi: Double): Double {
        return 0.5 * alas * tinggi
    }

    fun keliling(alas: Double,
                 sisiKiri: Double,
                 sisiKanan: Double): Double {
        return alas + sisiKiri + sisiKanan
    }

    if (luas) {
        println("Luas segitiga adalah: ${luas(alas, tinggi)} cm^2")
    }

    if (keliling) {
        println("Keliling segitiga adalah: ${keliling(alas, sisiKiri, sisiKanan)} cm")
    }
}

/**
 * Fungsi di bawah ini adalah fungsi belah ketupat dan layang-layang,
 * dengan parameter, rumus luas dan kelilingnya sendiri.
 */
fun rumusBelahKetupat(layangLayang: Boolean?,
                      sisi1: Double = 0.0,
                      sisi2: Double = 0.0,
                      diagonal1: Double = 0.0,
                      diagonal2: Double = 0.0,
                      luas: Boolean = false,
                      keliling: Boolean = false) {

    fun luas(diagonal1: Double, diagonal2: Double): Double {
        return 0.5 * diagonal1 * diagonal2
    }

    fun keliling(sisi1: Double, sisi2: Double): Double {
        return 2 * (sisi1 + sisi2)
    }

    if (luas) {
        println("Luas ${layangLayang?.let {"layang-layang"} ?: "belah ketupat"} " +
                "adalah: ${luas(diagonal1, diagonal2)} cm^2")
    }

    if (keliling) {
        println("Keliling ${layangLayang?.let {"layang-layang"} ?: "belah ketupat"} " +
                "adalah: ${keliling(sisi1, sisi2)} cm")
    }
}