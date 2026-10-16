// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val tuoi = 18

    val loaiVe = if (tuoi < 6) {
        "Vé trẻ em (Miễn phí)"
    } else if (tuoi <= 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }

    println("Tuổi khách hàng: $tuoi")
    println("Loại vé: $loaiVe")
}