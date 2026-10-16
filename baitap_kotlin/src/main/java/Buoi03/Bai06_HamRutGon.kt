// Họ và tên: Lý Ngọc Ân - MSSV: 25810004

fun tinhBinhPhuongFull(x: Int): Int {
    return x * x
}
fun tinhBinhPhuongShort(x: Int): Int = x * x

fun tinhChuViHinhVuongFull(canh: Double): Double {
    return canh * 4
}
fun tinhChuViHinhVuongShort(canh: Double): Double = canh * 4

fun laSoChanFull(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanShort(n: Int): Boolean = n % 2 == 0

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    println("Bình phương (5): ${tinhBinhPhuongFull(5)} vs ${tinhBinhPhuongShort(5)}")
    println("Chu vi hình vuông (4.5): ${tinhChuViHinhVuongFull(4.5)} vs ${tinhChuViHinhVuongShort(4.5)}")
    println("Số chẵn (4): ${laSoChanFull(4)} vs ${laSoChanShort(4)}")
}