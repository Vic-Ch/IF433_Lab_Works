package oop_108273_victorchandra.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
  override fun processPayment(amount: Double) {
    if(balance >= amount) {
      balance -= amount
      println("Transaksi sukses")
    } else {
      println("Saldo tidak cukup")
    }
  }

  fun topUp(amount: Double) {
    balance += amount
    println("Berhasil top-up sebesar $amount. Saldo sekarang $balance")
  }
}