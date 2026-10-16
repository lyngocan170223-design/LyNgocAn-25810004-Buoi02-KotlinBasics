// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Khách hàng: $tenKhachHang | Số lượng: $soLuongKhach khách | Loại bàn: $loaiBan")
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    datBan("Nguyễn Văn A", 2)

    datBan("Trần Thị B", 4, "Bàn VIP")

    datBan(soLuongKhach = 6, tenKhachHang = "Lê Văn C", loaiBan = "Bàn ngoài trời")
}