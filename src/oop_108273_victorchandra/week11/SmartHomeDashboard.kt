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

  val device2 = SmartDevice("Ezviz Outdoor", "Camera")
  device2.apply {
    isOnline = true
    powerLoad = 5
  }.also {
    println("\n(LOG) Kamera terhubung")
    println("-> ${it.diagnose()}")
  }

  homeDevices.add(device2)


  homeDevices.run {
    this.add(SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800))
    this.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
    println("\n$this")
  }

  val searchResult = homeDevices.find {
    it.category == "Camera"
  }?.let {
    println(it.diagnose())
  }


  with(homeDevices) {
    println("\n=== Summary ===")
    this.forEach { println(it.name) }
    println("Total Barang: ${this.size}")
  }
}