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

  // validasi input (izin modifikasi dari yand di modul agar lebih bersih untuk jalur reguler dan umum
  if (nim.length != 5) {
    println("ERROR: Pendaftaran dibatalkan. NIM haris 5 karakter!")
  } else {
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
      print("Masukkan jurusan: ")
      val major = scanner.nextLine()
      val s1 = Student(name, nim, major)
      println("Status: Pendaftaran selesai.")
      println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
      val s2 = Student(name, nim)
      println("Status: Pendaftaran selesai.")
      println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
      println("Pilihan ngawur, pendaftaran batal!")
    }
  }
}