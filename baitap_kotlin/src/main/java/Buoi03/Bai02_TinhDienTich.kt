// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val dienTich1 = tinhDienTich(5.5, 3.0)
    val dienTich2 = tinhDienTich(10.0, 4.5)

    println("Diện tích hình chữ nhật 1 (5.5 x 3.0): $dienTich1")
    println("Diện tích hình chữ nhật 2 (10.0 x 4.5): $dienTich2")
}