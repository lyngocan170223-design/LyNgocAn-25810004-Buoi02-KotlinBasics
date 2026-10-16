// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split("\\s+".toRegex())
            if (parts.size >= 2) {
                ho = parts.first()
                ten = parts.last()
            } else if (parts.size == 1) {
                ho = ""
                ten = parts[0]
            }
        }
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))

    val kh = KhachHang("Nguyễn", "An")
    println("Họ tên ban đầu: ${kh.hoTen}")

    kh.ten = "Bình"
    println("Sau khi đổi tên thành 'Bình', họ tên mới: ${kh.hoTen}")

    kh.hoTen = "Lý Ngọc Ân"
    println("Sau khi gán hoTen = 'Lý Ngọc Ân':")
    println(" - Họ mới (ho): ${kh.ho}")
    println(" - Tên mới (ten): ${kh.ten}")
}