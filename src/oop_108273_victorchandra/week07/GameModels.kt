package oop_108273_victorchandra.week07

enum class ItemRartiy(val dropChance: Int){
  COMMON(70),
  UNCOMMON(20),
  RARE(5),
  EPIC(4),
  LEGENDARY(1)
}

data class GameItem(val name: String, val damageL Int, val rarity: ItemRartiy) {
  
}