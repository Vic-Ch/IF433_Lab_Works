package oop_108273_victorchandra.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
  companion object {
    fun forgeStarterSword(): Weapon {
      val r = ItemRarity.COMMON
      val wp = GameItem("Pedang Kayu Bapuk", 5, r)
      return Weapon(wp,50)
    }

    fun forgeEpicSword(): Weapon {
      val r = ItemRarity.EPIC
      val wp = GameItem("Pedang Firaun", 99, r)
      return Weapon(wp, 90)
    }
  }
}