// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val hinhVuong = HinhVuong(4.0)
    val hinhTron = HinhTron(3.0)

    println("Diện tích hình vuông cạnh 4.0: ${hinhVuong.tinhDienTich()}")
    println("Diện tích hình tròn bán kính 3.0: ${hinhTron.tinhDienTich()}")
}