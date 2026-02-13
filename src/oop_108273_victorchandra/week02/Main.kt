package oop_108273_victorchandra.week02

import java.util.Scanner

fun main() {
  val scanner = Scanner(System.`in`)

  println("--- APLIKASI PMB UMN ---")

  print("Masukkan nama: ")
  val name = scanner.nextLine()

  print("Masukkan NIM (wajib 5 karakter): ")
  val nim = scanner.next()

  scanner.nextLine()

  // validasi input
  if (nim.length != 5) {
    println("ERROR: Pendaftaran dibatalkan. NIM haris 5 karakter!")
  } else {
    print("Masukkan jurusan: ")
    val major = scanner.nextLine()

    // instance objek
    val s1 = Student(name, nim, major)
    println("Status: Pendaftaran selesai.")
  }
}