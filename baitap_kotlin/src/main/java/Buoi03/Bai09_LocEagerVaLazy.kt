// Họ và tên: Lý Ngọc Ân - MSSV: 25810004
fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val nhacCu = listOf("Guitar", "Piano", "Violon", "Drum", "Flute", "Organ")
    val chuCáiBatDau = 'P'

    val ketQuaEager = nhacCu.filter { it.startsWith(chuCáiBatDau, ignoreCase = true) }
    println("Lọc thông thường (Eager): $ketQuaEager")

    val ketQuaLazy = nhacCu.asSequence()
        .filter { it.startsWith(chuCáiBatDau, ignoreCase = true) }
        .toList()
    println("Lọc qua Sequence (Lazy): $ketQuaLazy")
}
