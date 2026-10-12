// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    // Đoạn đếm ngược từ 10 về 1 bắt buộc dùng while
    println("--- Đếm ngược từ 10 về 1 ---")
    var dem = 10
    while (dem >= 1) {
        println("Số: $dem")
        dem--
    }

    // Đoạn in dòng cố định 5 lần liên tiếp bắt buộc dùng repeat
    println("\n--- In dòng cố định ---")
    repeat(5) {
        println("Lập trình Kotlin cơ bản rất thú vị!")
    }
}