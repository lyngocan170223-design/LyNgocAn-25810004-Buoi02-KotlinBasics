// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
class TaiKhoanNganHang1(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nạp thành công $soTien. Số dư hiện tại: $soDu")
        } else {
            println("Số tiền nạp phải lớn hơn 0.")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien
            println("Rút thành công $soTien. Số dư còn lại: $soDu")
            return true
        } else {
            println("Rút tiền thất bại! Số dư không đủ hoặc số tiền không hợp lệ.")
            return false
        }
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val taiKhoan = TaiKhoanNganHang1("VCB-012345", 1000000.0)
    println("Tài khoản: ${taiKhoan.soTaiKhoan} - Số dư ban đầu: ${taiKhoan.soDu}")

    taiKhoan.napTien(500000.0)
    taiKhoan.rutTien(300000.0)
    taiKhoan.rutTien(1500000.0)
}