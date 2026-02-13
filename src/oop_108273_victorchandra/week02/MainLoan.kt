package oop_108273_victorchandra.week02

import java.util.Scanner

fun main() {
  val scanner = Scanner(System.`in`)

  println("--- Library Fine System ---")

  print("Masukkan judul: ")
  val judul = scanner.nextLine()

  print("Masukkan nama peminjam: ")
  val peminjam = scanner.nextLine()

  print("Lama pinjam: ")
  val durasi = scanner.nextInt()
  scanner.nextLine()

  if (durasi < 0) {
    println("Durasi minus, otomatis set ke 1 hari")
    val data = Loan(judul, peminjam)
  } else {
    val data2 = Loan(judul, peminjam, durasi)
  }
}