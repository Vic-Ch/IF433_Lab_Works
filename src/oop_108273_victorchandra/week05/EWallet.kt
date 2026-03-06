package oop_108273_victorchandra.week05

class EWallet(accountName: String): PaymentMethod(accountName) {
  var balance: Double = 0.0

  override fun processPayment(amount: Double) {
    if(balance >= amount) {
      balance -= amount
      println("Sukses")
    }
  }

  fun topUp(amount: Double) {
    balance += amount
  }
}