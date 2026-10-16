// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là $tocDoToiDa km/h.")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val xeMay = XeMay()
    val oTo = OTo()

    print("Xe máy: ")
    xeMay.moTa()

    print("Ô tô: ")
    oTo.moTa()
}