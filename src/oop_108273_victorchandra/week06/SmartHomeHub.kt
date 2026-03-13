package oop_108273_victorchandra.week06

class SmartHomeHub {
  val devices = mutableListOf<SmartDevice>()

  fun addDevice(devices: SmartDevice) {
    this.devices.add(devices)
    println("Device ${devices.name} dengan ID ${devices.id} berhasil ditambahkan.")
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

  fun activeSecurityMode() {
    for (d in devices) {
      when(d) {
        is Recordable -> {
          d.startRecord()
        }

        is SmartSpeaker -> {
          d.playMusic("Sirine Peringatan")
        }
      }
      println("---")
    }
  }
}