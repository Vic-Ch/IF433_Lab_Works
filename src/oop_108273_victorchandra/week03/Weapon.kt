package oop_108273_victorchandra.week03

class Weapon(val name: String) {
  var damage: Int = 0
    set(value) {
      if (value < 0) println("Damage tidak boleh negatif, auto set ke 0")
      else if (value > 1000) {
        field = 1000
        println("Damage overpowered, tetap di angka 1000!")
      } else field = value
    }

  val tier: String
    get() {
      return when {
        damage > 800 -> "Legendary"
        damage > 500 -> "Epic"
        else -> "Common"
      }
    }
}