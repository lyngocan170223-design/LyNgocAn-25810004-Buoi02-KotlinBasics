// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soDienThoai: String,
    soNhaTenDuong: String = "123 Đường Lê Lợi",
    phuongXa: String = "Phường Bến Thành",
    quanHuyen: String = "Quận 1",
    tinhThanhPho: String = "TP. Hồ Chí Minh"
) {
    println("Người nhận: $tenNguoiNhan - SĐT: $soDienThoai")
    println("Địa chỉ: $soNhaTenDuong, $phuongXa, $quanHuyen, $tinhThanhPho")
    println("----------------------------------------")
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    dinhDangDiaChi(
        "Lý Ngọc Ân",
        "0901234567",
        soNhaTenDuong = "456 Đường Nguyễn Huệ",
        phuongXa = "Phường Sài Gòn",
        quanHuyen = "Quận 1",
        tinhThanhPho = "TP. Hồ Chí Minh"
    )
}