package oop_108273_victorchandra.week10

fun main() {
  val coinRepo = WalletRepository<Coin>()
  coinRepo.add(Coin("BTC", 1000.0))
  coinRepo.add(Coin("USDT", 950.0))
  coinRepo.add(Coin("ETH", 1500.0))

  val response = ApiResponse("200 OK", coinRepo.getAll())
  response.data.forEach {
    x -> println("Coin: ${x.name}, Balance: ${x.balance}")
  }

  val txRepo = WalletRepository<Transaction>()
  txRepo.add(Transaction("TRX-1", 1000.0))
  txRepo.add(Transaction("TRX-2", 1100.0))
  txRepo.add(Transaction("TRX-3", 1200.0))

  val response2 = ApiResponse("200 OK", txRepo.getAll())
  response2.data.forEach {
      x -> println("Transaction: ${x.id}, Amount: ${x.amount}")
  }
}