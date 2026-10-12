// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
package com.example.Buoi02

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    // Khởi tạo mutableMapOf lưu tên môn học (Key) và điểm số (Value)
    val danhSachDiem = mutableMapOf(
        "Toán Cao Cấp" to 8.5,
        "Lập Trình Java" to 9.0,
        "Cấu Trúc Dữ Liệu" to 7.5,
        "Vật Lý Đại Cương" to 8.0,
        "Triết Học Mác-Lênin" to 7.0
    )

    println("--- Bảng điểm ban đầu ---")
    for ((monHoc, diem) in danhSachDiem) {
        println("$monHoc: $diem")
    }

    // Thêm một môn học mới
    danhSachDiem["Lập Trình Kotlin"] = 9.5

    // Cập nhật điểm của một môn học có sẵn
    danhSachDiem["Vật Lý Đại Cương"] = 8.5

    // Xóa một môn học theo tên khóa (key)
    danhSachDiem.remove("Triết Học Mác-Lênin")

    println("\n--- Bảng điểm sau khi thêm, cập nhật và xóa ---")
    for ((monHoc, diem) in danhSachDiem) {
        println("$monHoc: $diem")
    }
}