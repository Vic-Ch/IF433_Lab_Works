package oop_108273_victorchandra.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
  override fun turnOn() {
    println("Speaker $name menyala.")
  }

  override fun turnOff() {
    println("Speaker $name padam.")
  }

  fun playMusic(song: String) {
    println("Memutar lagu $song dari Spotify.")
  }
}