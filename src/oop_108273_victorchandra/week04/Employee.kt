package oop_108273_victorchandra.week04

open class Employee(val name: String, val baseSalary: Int) {
  open fun work() {
    println("$name sedang bekerja.")
  }

  open fun calculateBonus() = 0.1 * baseSalary
}