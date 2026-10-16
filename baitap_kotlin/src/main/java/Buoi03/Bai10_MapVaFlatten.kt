// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val soNhanDoi = danhSachSo.map { it * 2 }

    println("--- PHẦN 1: MAP ---")
    println("Danh sách gốc: $danhSachSo")
    println("Danh sách sau khi nhân đôi (map): $soNhanDoi")

    println("\n--- PHẦN 2: FLATTEN ---")
    val danhSachLong = listOf(
        listOf(1, 2),
        listOf(3, 4, 5),
        listOf(6)
    )
    val danhSachPha = danhSachLong.flatten()

    println("Danh sách lồng nhau: $danhSachLong")
    println("Danh sách sau khi làm phẳng (flatten): $danhSachPha")
}