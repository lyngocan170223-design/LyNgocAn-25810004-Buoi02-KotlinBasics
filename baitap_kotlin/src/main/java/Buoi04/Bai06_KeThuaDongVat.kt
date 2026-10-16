// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Âm thanh động vật chung"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu!"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo!"
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val danhSachDongVat = listOf(
        Cho("Chú cún Lu"),
        Meo("Mèo mướp Mi"),
        Cho("Chó mực"),
        Meo("Mèo Ba Tư")
    )

    for (dv in danhSachDongVat) {
        println("Con vật: ${dv.ten} | Tiếng kêu: ${dv.keu()}")
    }
}