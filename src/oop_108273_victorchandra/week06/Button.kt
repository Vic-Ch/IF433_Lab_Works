package oop_108273_victorchandra.week06

class Button(override val name: String): Clickable {
  override fun click() {
    println("Tombol '$name' berhasil diklik")
  }
}