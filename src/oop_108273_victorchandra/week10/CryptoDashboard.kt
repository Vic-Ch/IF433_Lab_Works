package oop_108273_victorchandra.week10

fun main() {
  val coinRepo = WalletRepository<Coin>()
  coinRepo.add(Coin("BTC", 1000.0))
  coinRepo.add(Coin("USDT", 950.0))
  coinRepo.add(Coin("ETH", 1500.0))
}