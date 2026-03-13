package oop_108273_victorchandra.week06

import javax.swing.text.StyleContext

fun processCheckout(method: PaymentMethod, amount: Double) {
  println("-> Memulai checkout...")
  method.pay(amount)
}

fun main() {
  val myWatch = Smartwatch()
  myWatch.showTime()

  val myPhone = Smartphone()
  myPhone.turnOn()

  val pay1 = Gopay()
  val pay2 = CreditCard()

  println("\n=== TESTING CHECKOUT ===")
  processCheckout(pay1, 50000.0)
  processCheckout(pay2, 150000.0)

  // tes task
  println("\n=== TASK ===")
  val lamp = SmartLamp("123", "Ruang Tamu")
  val speaker = SmartSpeaker("456", "Google Nest Dapur")
  val cctv = SmartCCTV("999", "Ezviz Garasi")

  val barang = SmartHomeHub()
  barang.addDevice(lamp)
  barang.addDevice(speaker)
  barang.addDevice(cctv)

  println("\n=== Devices ===")
  barang.activeSecurityMode()
  barang.turnOffAllSwitches()
}