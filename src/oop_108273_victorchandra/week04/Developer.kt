package oop_108273_victorchandra.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
  override fun work() {
    println("$name sedang ngoding dengan menggunakan $programmingLanguage.")
  }
}