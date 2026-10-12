// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    // Khởi tạo danh sách có thể thay đổi (mutableListOf) chứa 5 cuốn sách ban đầu
    val danhSachSach = mutableListOf("Toán Cao Cấp", "Lập Trình Java", "Cấu Trúc Dữ Liệu", "Vật Lý Đại Cương", "Triết Học Mác-Lênin")

    println("--- Danh sách sách ban đầu ---")
    println(danhSachSach)

    // Thêm vào 2 cuốn sách mới
    danhSachSach.add("Lập Trình Kotlin")
    danhSachSach.add("Lịch Sử Đảng")

    // Xoá 1 cuốn theo tên
    danhSachSach.remove("Triết Học Mác-Lênin")

    // Sắp xếp danh sách theo thứ tự chữ cái bằng hàm có sẵn của Kotlin
    danhSachSach.sort()

    println("\n--- Danh sách sách sau khi thêm, xoá và sắp xếp ---")
    println(danhSachSach)
}