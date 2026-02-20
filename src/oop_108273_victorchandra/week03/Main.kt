package oop_108273_victorchandra.week03

fun main()  {
  val e = Employee("Budi")

  // test validasi salary
  e.salary = -1000
  e.salary = 5000000
  println("Gaji: ${e.salary}")

  // test enkapsulasi
  e.increasePerfomance()
//  e.perfomanceRating = 5 // test yang private

  // test computed property
  println("Pajak yang harus dibayar: ${e.tax}")
}