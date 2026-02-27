package oop_108273_victorchandra.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {
  final override fun accelerate() {
    println("$brand berakselarasi dalam sunyi. Kapasistas baterai: $batteryCapacity%.")
  }
}