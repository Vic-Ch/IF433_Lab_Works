package oop_108273_victorchandra.week01

fun main() {
  // Refactor: pakai val dan hapus tipe data eksplisit
  var name = "John Thor"
  var score = 80

  // Refactor: string template ($name)
  println("Nama: $name, Nilai: $score")

  val grade = when(score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    else -> "D"
  }

  println("Grade kamu: $grade")
  println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"