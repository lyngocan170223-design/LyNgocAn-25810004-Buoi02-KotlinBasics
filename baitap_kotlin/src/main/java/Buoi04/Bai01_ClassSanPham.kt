// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val sp1 = SanPham("Điện thoại thông minh", 12500000.0, 50)

    val sp2 = SanPham(tenSanPham = "Laptop Văn Phòng", gia = 18500000.0)

    println("--- Thông tin Sản phẩm 1 ---")
    println("Tên: ${sp1.tenSanPham}")
    println("Giá: ${sp1.gia}")
    println("Số lượng tồn kho: ${sp1.soLuongTonKho}")

    println("\n--- Thông tin Sản phẩm 2 ---")
    println("Tên: ${sp2.tenSanPham}")
    println("Giá: ${sp2.gia}")
    println("Số lượng tồn kho: ${sp2.soLuongTonKho}")
}