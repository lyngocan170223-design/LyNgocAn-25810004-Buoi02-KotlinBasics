// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val soLuong: Int = 5
    val donGia: Double = 150000.0
    val thueSuat: Double = 0.08 // Thuế 8%

    // Ép kiểu số lượng sang Double trước khi nhân với đơn giá
    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * thueSuat
    val tongTien: Double = tienHang + tienThue

    println("Tiền hàng: $tienHang VNĐ")
    println("Tiền thuế (8%): $tienThue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}