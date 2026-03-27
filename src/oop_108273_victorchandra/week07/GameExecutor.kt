package oop_108273_victorchandra.week07

fun processEvent(event: BattleState) = when(event) {
  is BattleState.GameOver -> println("Reason: ${event.reason}")
  is BattleState.LootDropped -> {
    println("Looted ${event.item.name} with ${event.item.rarity}")
  }
  is BattleState.MonsterEncounter -> println("Encounter ${event.monsterName}!")
  BattleState.SafeZone -> println("You are in Safe Zone.")
}