package oop_108273_victorchandra.week09

fun main() {
  val tradeHistory: List<TradeLog> = listOf(
    TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 20, roe = 45.5, status = "CLOSED"),
    TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 10, roe = -12.3, status = "CLOSED"),
    TradeLog(pair = "SOLUSDT", position = "LONG", leverage = 50, roe = 120.0, status = "OPEN"),
    TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 20, roe = -5.0, status = "OPEN"),
    TradeLog(pair = "ETHUSDT", position = "LONG", leverage = 5, roe = 8.2, status = "CLOSED"),
    TradeLog(pair = "SOLUSDT", position = "SHORT", leverage = 25, roe = -22.4, status = "CLOSED"),
    TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 100, roe = -80.5, status = "CLOSED"),
    TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 10, roe = 15.1, status = "OPEN"),
    TradeLog(pair = "DOGEUSDT", position = "LONG", leverage = 20, roe = 3.5, status = "CLOSED"),
    TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 50, roe = 65.8, status = "CLOSED")
  )

  val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
//  closedTrades.forEach { println(it) }

  val winningTrades = closedTrades.filter { it.roe > 0 }
//  winningTrades.forEach { println(it) }

  val losingTrades = closedTrades.filter { it.roe <= 0 }
//  losingTrades.forEach { println(it) }

  val topPerformersString = winningTrades
    .sortedByDescending { it.roe }
    .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage})x" }

  val worstPerformersString = losingTrades
    .sortedBy { it.roe }
    .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage})x" }
//  worstPerformersString.forEach { println(it) }

  val uniquePairs = tradeHistory.map{it.pair}.toSet()
//  println(uniquePairs)

  println("=== CRYPTO TRADING DASHBOARD ===")
  topPerformersString.forEach { println(it) }
}