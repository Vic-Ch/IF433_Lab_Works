package oop_108273_victorchandra.week03

class Player(val username: String) {
  private var xp: Int = 0

  var curr: Int = 0

  val level: Int
    get() = xp / 100

  fun addXp(amount: Int) {
    if (amount < 0) println("Amount tidak bisa 0")
    else {
      xp += amount
      if (level > curr) {
        curr = level
        println("Level Up! Selamat $username naik ke $level")
      }
    }
  }
}