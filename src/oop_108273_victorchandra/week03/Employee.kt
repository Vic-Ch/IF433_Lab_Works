package oop_108273_victorchandra.week03

class Employee(val name: String) {
  var salary: Int = 0
    set(value) {
      if (value < 0) {
        field = 0
      } else {
        field = value
      }
    }

  private var performanceRating: Int = 3

  fun increasePerfomance() {
    performanceRating++
    println("Kinerja $name meningkat! Rating: $performanceRating")
  }

  fun printStatus() {
    println("Karyawan: $name, Rating: $performanceRating")
  }

  val tax: Double
    get() = salary * 0.1
}