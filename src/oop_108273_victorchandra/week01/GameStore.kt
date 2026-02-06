package oop_108273_victorchandra.week01

fun main() {
  val gameTitle: String
  val price: Int

  price = 450000

  var userNote: String? = null
  
  printReceipt(title = "Math Master", price = price,
    finalPrice = (1 - calculateDiscount(price)) * price,
    note = userNote ?: "Tidak ada catatan")
}

fun calculateDiscount(price: Int) = if (price > 500000) 0.2 else 0.1

/*
  izin memakai double untuk parameter finalPrice dan menambahkan argumen price
  serta mengisi nilai price di main() agar bisa dijalankan sesuai dengan requirement di
  spesifikasi bisnis
*/

fun printReceipt(title: String, price: Int, finalPrice: Double, note: String) = println(
  "Title: $title\nHarga Awal: $price\nHarga Akhir: ${finalPrice.toInt()}\nCatatan: $note")