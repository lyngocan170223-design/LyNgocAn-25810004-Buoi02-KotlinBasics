// Họ và tên: Lý Ngọc Ân - MSSV: 25810004

fun ghiNhatKyExplicit(hanhDong: String): Unit {
    println("[NHẬT KÝ]: $hanhDong")
}

fun ghiNhatKyImplicit(hanhDong: String) {
    println("[NHẬT KÝ]: $hanhDong")
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    ghiNhatKyExplicit("Đăng nhập thành công vào hệ thống.")
    ghiNhatKyImplicit("Đăng nhập thành công vào hệ thống.")
}