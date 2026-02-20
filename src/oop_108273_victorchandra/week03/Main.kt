package oop_108273_victorchandra.week03

import java.util.Scanner

fun main()  {
  val e = Employee("Budi")
  e.salary = -1000
  e.salary = 5000000
  println("Gaji: ${e.salary}")

  e.increasePerfomance()

  println("Pajak yang harus dibayar: ${e.tax}")

  println("--- Task 1 ---")
  val scanner = Scanner(System.`in`)

  print("Masukkan nama senjata: ")
  val name = scanner.nextLine()

  print("Masukkan damage senjata: ")
  val dmg = scanner.nextInt()
  scanner.nextLine()

  val w1 = Weapon(name)

  w1.damage = dmg
  println("Senjata ${w1.name} dengan damage ${w1.damage}, tiernya: ${w1.tier}")
}