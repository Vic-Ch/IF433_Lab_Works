package oop_108273_victorchandra.week06

class SmartHomeHub {
  val devices = mutableListOf<SmartDevice>()

  fun addDevice(device: SmartDevice) {
    println("Device ${device.name} dengan ID ${device.id} berhasil ditambahkan.")
  }

  fun turnOffAllSwitches() {
    for (d in devices) {
      when(d) {
        is Switchable -> {
          d.turnOff()
        }
      }
      println("---")
    }
  }

}