package oop_108273_victorchandra.week01

fun main() {
  val radius = 7.0
  val pi = 3.14

  // hitung area lingkaran
  var area = pi * radius * radius

  // print area lingkaran dengan keterangan radius
  println("Radius: $radius, Area: $area")

  // print jenis lingkaran
  println("This is a ${checkSize(area)}")
}

fun checkSize(area: Double) = if (area > 100) "Big Circle" else "Small Circle"