// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val kiemTraDoDai: (String) -> Boolean = { matKhau ->
        matKhau.length >= 8
    }

    val mk1 = "123456"
    val mk2 = "MatKhauManh123"
    val mk3 = "abc"

    println("Mật khẩu '$mk1' hợp lệ: ${kiemTraDoDai(mk1)}")
    println("Mật khẩu '$mk2' hợp lệ: ${kiemTraDoDai(mk2)}")
    println("Mật khẩu '$mk3' hợp lệ: ${kiemTraDoDai(mk3)}")
}