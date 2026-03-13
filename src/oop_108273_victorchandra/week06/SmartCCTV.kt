package oop_108273_victorchandra.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
  override fun startRecord() {
    println("CCTV sedang merekam.")
  }

  override fun stopRecord() {
    super.stopRecord()
  }

  override fun turnOn() {
    println("CCTV $name menyala.")
    startRecord()
  }

  override fun turnOff() {
    println("CCTV $name padam.")
  }
}