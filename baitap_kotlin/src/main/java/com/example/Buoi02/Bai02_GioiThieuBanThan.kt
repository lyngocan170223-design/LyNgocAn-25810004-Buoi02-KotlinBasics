// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val hoTen: String = "Lý Ngọc Ân"
    val namSinh: Int = 2004
    val namHienTai: Int = 2026
    val tuoi: Int = namHienTai - namSinh

    // Sử dụng string template với dấu $ để chèn biến vào chuỗi
    println("Xin chào, tôi tên là $hoTen, sinh năm $namSinh, năm nay $tuoi tuổi.")
}
