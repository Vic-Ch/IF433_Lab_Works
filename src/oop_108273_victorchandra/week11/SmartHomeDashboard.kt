package oop_108273_victorchandra.week11

fun main() {
  val homeDevices = mutableListOf<SmartDevice>()

  val device = SmartDevice().apply {
    name = "Phillips WiZ Living Room"
    category = "Lighting"
    isOnline = true
    powerLoad = 12
  }

  homeDevices.also {
    println("Sebelum: $it")
  }.add(device)

  println("Setelah: $homeDevices")
}