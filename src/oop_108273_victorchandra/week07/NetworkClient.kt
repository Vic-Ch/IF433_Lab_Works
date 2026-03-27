package oop_108273_victorchandra.week07

class NetworkClient private constructor(var url: String) {
  fun connect() {
    println("Connecting to $url...")
  }
}