package oop_108273_victorchandra.week03

import java.util.Scanner

fun main()  {
  val e = Employee("Budi")
  e.salary = -1000
  e.salary = 5000000
  println("Gaji: ${e.salary}")

  e.increasePerfomance()

  println("Pajak yang harus dibayar: ${e.tax}")

  // tugas 1
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

  // tugas 2
  println("\n--- Task 2 ---")
  val p1 = Player("Vic")
//  p1.xp = 100
  p1.addXp(50)
  p1.addXp(60)
  p1.addXp(0)
  p1.addXp(100)

  val p2 = Player("Chan")
  p2.addXp(101)
  p2.addXp(-99)
  p2.addXp(320)
  p2.addXp(999)
}