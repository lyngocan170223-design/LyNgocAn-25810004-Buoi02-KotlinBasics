// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val nv1 = NhanVien("NV001", "Nguyễn Văn A", 15000000.0)
    val nv2 = NhanVien("Trần Thị B")

    println("Nhân viên 1 - Tên: ${nv1.ten}, Lương: ${nv1.luongThang}")
    println("Nhân viên 2 - Tên: ${nv2.ten}, Lương: ${nv2.luongThang}")
}