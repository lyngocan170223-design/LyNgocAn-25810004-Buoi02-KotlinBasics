// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
class TaiKhoanNganHang(
    val soTaiKhoan: String,
    val soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản thành công! Số dư ban đầu: $soDuBanDau")
        }
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    println("Đang tạo tài khoản 1 (Hợp lệ):")
    val tk1 = TaiKhoanNganHang("STK123456", 500000.0)

    println("\nĐang tạo tài khoản 2 (Không hợp lệ - Số dư âm):")
    val tk2 = TaiKhoanNganHang("STK987654", -100000.0)
}