package oop_108273_victorchandra.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName) {
  override fun processPayment(amount: Double) {
    if(usedAmount + amount < limit) {
      usedAmount += amount
      println("Transaksi berhasil")
    } else {
      println("Transaksi ditolak")
    }
  }
}