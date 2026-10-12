// Họ và tên: Lý Ngọc An - MSSV: 25810004
package com.example.Buoi02
fun tinhTong(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val tenNguoiDung: String? = null

    val tenHienThi = tenNguoiDung ?: "Khách vãng lai"
    println("Xin chào, $tenHienThi!")

    val email: String? = "ngocan25810004@gmail.com"
    if (email != null) {
        println("Email của bạn là: $email")
    }

    val soA = 15
    val soB = 25
    val ketQua = tinhTong(soA, soB)
    println("Kết quả tổng của $soA và $soB là: $ketQua")
}