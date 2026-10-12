// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    // Biến lưu số dư ban đầu dùng `val` vì đây là giá trị gốc để đối chiếu và không được thay đổi
    val soDuBanDau: Double = 5000000.0

    // Biến lưu số dư hiện tại dùng `var` vì giá trị sẽ thay đổi liên tục qua các giao dịch
    var soDuHienTai: Double = soDuBanDau

    println("Số dư ban đầu: $soDuHienTai VND")

    // Giao dịch gửi thêm 2 triệu
    soDuHienTai += 2000000.0
    println("Sau khi gửi thêm 2,000,000 VND, số dư hiện tại: $soDuHienTai VND")

    // Giao dịch rút 1.5 triệu
    soDuHienTai -= 1500000.0
    println("Sau khi rút 1,500,000 VND, số dư hiện tại: $soDuHienTai VND")
}
