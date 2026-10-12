// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val diemTrungBinh: Double = 8.5

    // Sử dụng when kết hợp range để phân loại học lực
    val xepLoai: String = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.4 -> "Giỏi"
        in 5.5..6.9 -> "Khá"
        in 4.0..5.4 -> "Trung bình"
        in 0.0..3.9 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại học lực: $xepLoai")
}