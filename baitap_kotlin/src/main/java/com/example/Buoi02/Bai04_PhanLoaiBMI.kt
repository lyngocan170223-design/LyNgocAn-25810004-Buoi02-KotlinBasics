// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val canNang: Double = 65.0 // kg
    val chieuCao: Double = 1.75 // m

    // Công thức tính BMI = cân nặng / (chiều cao * chiều cao)
    val bmi: Double = canNang / (chieuCao * chieuCao)

    // Phân loại bằng if else if nhiều nhánh
    val phanLoai: String = if (bmi < 18.5) {
        "Gầy"
    } else if (bmi < 25.0) {
        "Bình thường"
    } else if (bmi < 30.0) {
        "Thừa cân"
    } else {
        "Béo phì"
    }

    println("Chỉ số BMI của bạn: $bmi")
    println("Phân loại: $phanLoai")
}
