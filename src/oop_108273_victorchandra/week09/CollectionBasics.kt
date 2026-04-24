package oop_108273_victorchandra.week09

fun main() {
  println("=== TEST LIST ===")
  val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
  println("Immutable list: $frameworks")

  val scores: MutableList<Int> = mutableListOf(85, 90)
  scores.add(95)
  scores[0] = 88
  println("Mutable list: $scores")


  println("\n\n=== TEST SET ===")
  val uniqueNumbers = setOf(1,2,2,3,3,4)
  println("Unique numbers (Set): $uniqueNumbers")

  val activeUsers = mutableSetOf("UserA", "UserB")
  activeUsers.add("UserC")
  activeUsers.add("UserD")
  println("Active users: $activeUsers")
}