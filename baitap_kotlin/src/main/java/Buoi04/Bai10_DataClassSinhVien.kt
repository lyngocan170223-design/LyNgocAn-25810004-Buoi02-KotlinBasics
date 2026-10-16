// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val sv1 = SinhVien("25810004", "Lý Ngọc Ân", 8.5)
    val sv2 = SinhVien("25810004", "Lý Ngọc Ân", 8.5)

    println("In object sv1 (toString tự sinh): $sv1")

    println("So sánh sv1 == sv2: ${sv1 == sv2}")

    val sv3 = sv1.copy(diemTrungBinh = 9.2)
    println("Object mới tạo từ copy() (sv3): $sv3")
}