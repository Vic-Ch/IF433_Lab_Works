package oop_108273_victorchandra.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
  override fun work() {
    println("$name sedang memimpin rapat divisi.")
  }

  override fun calculateBonus() = super.calculateBonus() + 500000
}