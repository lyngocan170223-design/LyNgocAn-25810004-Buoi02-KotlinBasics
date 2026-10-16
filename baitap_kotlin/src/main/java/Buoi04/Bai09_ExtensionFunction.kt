// Họ và tên: Lý Ngọc Ân - MSSV: 25810004

fun String.demNguyenAm(): Int {
    val nguyenAm = "ueoaiUEOAI"
    return this.count { it in nguyenAm }
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val s1 = "Lập trình Kotlin"
    val s2 = "Android Developer"
    val s3 = "XYZ"

    println("--- Kiểm tra đếm nguyên âm ---")
    println("Số nguyên âm trong '$s1': ${s1.demNguyenAm()}")
    println("Số nguyên âm trong '$s2': ${s2.demNguyenAm()}")
    println("Số nguyên âm trong '$s3': ${s3.demNguyenAm()}")

    val n1 = 7
    val n2 = 12
    val n3 = 19

    println("\n--- Kiểm tra số nguyên tố ---")
    println("Số $n1 có phải số nguyên tố? ${n1.laSoNguyenTo()}")
    println("Số $n2 có phải số nguyên tố? ${n2.laSoNguyenTo()}")
    println("Số $n3 có phải số nguyên tố? ${n3.laSoNguyenTo()}")
}