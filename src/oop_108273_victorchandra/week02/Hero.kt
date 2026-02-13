package oop_108273_victorchandra.week02

class Hero(val name: String, var hp: Int = 100, val baseDamage: Int) {
  fun attack(targetName: String) = println("$name menebas $targetName!")
  fun takeDamage(damage: Int) = if (hp - damage < 0) hp = 0 else hp = (hp - damage)
  fun isAlive() = if (hp > 0) true else false
}