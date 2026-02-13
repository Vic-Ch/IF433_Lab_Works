package oop_108273_victorchandra.week02

import java.util.Scanner

fun main() {
  val scanner = Scanner(System.`in`)

  // tampilan awal sistem game
  println("--- Mini RPG Battle ---")

  print("Masukkan nama Hero: ")
  val name = scanner.nextLine()

  print("Masukkan stat damage: ")
  val attack = scanner.nextInt()
  scanner.nextLine()

  print("Masukkan nama musuh: ")
  val enemy: String = scanner.nextLine()

  // inisialisasi variabel penting untuk memulai game
  var enemyHp = 100
//  val hero = Hero(name, baseDamage = attack) // ini kalau pakai default HP
  val hero = Hero(name, 10, attack)
  var choice: Int

  // loop battle
  while (hero.isAlive() && enemyHp > 0) {
    println("STAT = HP ${hero.name}: ${hero.hp}, HP $enemy: ${enemyHp}")
    print("Menu: 1. Serang, 2. Kabur\nInput: ")
    choice = scanner.nextInt()
    scanner.nextLine()

    if (choice == 1) {
      hero.attack(enemy)
      enemyHp -= hero.baseDamage
      println("$enemy terkena serangan sebesar ${hero.baseDamage}")
    } else if (choice == 2) {
      break
    } else {
      println("Salah input, tidak ada attack ke $enemy")
    }

    // logic handling biar kalau musuh masih hidup, maka tidak attack ke hero
    if (enemyHp > 0) {
      hero.takeDamage((10..20).random())
      println("$enemy membalas, ${hero.name} terkena serangan!")
    }
  }

  // print stats sebelum pengumuman
  print("-- Game Over --\nHP ${hero.name}: ${hero.hp} vs. HP $enemy: ${maxOf(enemyHp, 0)}\nPemenang adalah ")
  print(
    when {
      hero.hp == enemyHp -> "undefined (keduanya memiliki HP yang sama)"
      hero.hp > enemyHp -> "${hero.name}"
      else -> "$enemy"
    }
  )
}