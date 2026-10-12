// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val fibonacciList = mutableListOf<Int>()
    var a = 0
    var b = 1

    // Sinh dãy Fibonacci nhỏ hơn 100
    while (a < 100) {
        fibonacciList.add(a)
        val temp = a + b
        a = b
        b = temp
    }

    println("Danh sách các số Fibonacci nhỏ hơn 100:")
    // Dùng vòng lặp for kết hợp withIndex() để in kèm chỉ số thứ tự
    for ((index, value) in fibonacciList.withIndex()) {
        println("Vị trí $index: $value")
    }
}
