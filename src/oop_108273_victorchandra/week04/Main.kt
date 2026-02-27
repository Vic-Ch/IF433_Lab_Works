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

  println("\n--- Testing Manager ---")
  val mgr = Manager("Victor", 10000000)
  mgr.work()
  // gaji victor 10 juta
  println("Bonus ${mgr.name}: Rp${mgr.calculateBonus().toInt()}")

  println("\n--- Testing Developer ---")
  val dev = Developer("Chandra", 9000000, "Node-Next")
  dev.work()
  // gaji chandra 9 juta
  println("Bonus ${dev.name}: Rp${dev.calculateBonus().toInt()}")
}