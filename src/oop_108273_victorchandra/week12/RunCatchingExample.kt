package oop_108273_victorchandra.week12

fun main() {
  println("=== TEST RUNCATCHING ===")
  val result: Result<Int> = runCatching {
    "42X".toInt()
  }
}