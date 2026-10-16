// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun themChamThan(s: String): String {
    return "$s!"
}

fun xuLyVanBan(vanBan: String, hanhDong: (String) -> String): String {
    return hanhDong(vanBan)
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val goc = "Lập trình Kotlin"

    val ketQua1 = xuLyVanBan(goc) { s -> s.uppercase() }
    println("Cách 1 (Lambda trực tiếp): $ketQua1")

    val ketQua2 = xuLyVanBan(goc, ::themChamThan)
    println("Cách 2 (Function reference): $ketQua2")

    val ketQua3 = xuLyVanBan(goc) { s ->
        s.reversed()
    }
    println("Cách 3 (Trailing lambda): $ketQua3")
}