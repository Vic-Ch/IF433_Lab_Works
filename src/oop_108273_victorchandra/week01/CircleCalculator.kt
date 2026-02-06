package oop_108273_victorchandra.week01

fun main(args: Array<String>) {
  // variable definition
  val radius = 7.0
  val pi = 3.14

  // calculation
  var area = pi * radius * radius

  // output concat
  println("Radius: $radius, Area: $area")

  // logic check
  println("This is a ${checkSize(area)}")
}

fun checkSize(area: Double) = if (area > 100) "Big Circle" else "Small Circle"