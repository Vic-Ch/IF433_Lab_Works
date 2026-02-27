package oop_108273_victorchandra.week04

fun main() {
  println("--- Testing Vehicle ---")
  val generalVehicle = Vehicle("Sepeda Onthel")
  generalVehicle.honk()
  generalVehicle.accelerate()

  println("\n--- Testing Car ---")
  val myCar = Car("Toyota", 4)
  myCar.openTrunk()
  myCar.honk()
  myCar.accelerate()

  println("\n--- Testing Electric Car ---")
  val ev = ElectricCar("Geely", 2, 99)
  ev.openTrunk()
  ev.accelerate()
  ev.honk()
}