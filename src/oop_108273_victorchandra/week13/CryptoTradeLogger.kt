package oop_108273_victorchandra.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
  val id: Int, val symbol: String, val type: String,
  val margin: Double, val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
  val parts = line.split(",")
  val id = parts[0]
  val symbol = parts[1]
  val type = parts[2]
  val margin = parts[3]
  val pnl = parts[4]
  try {
    return TradeRecord(id.toInt(), symbol, type, margin.toDouble(), pnl.toDouble())
  } catch(e: NumberFormatException) {
    println("(Log) Data korup diabaikan: $line")
    return null
  } catch(e: IndexOutOfBoundsException) {
    println("(Log) Data korup diabaikan: $line")
    return null
  }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
  File(path).printWriter().use { o ->
    trades.forEach { o.println(it.toCsv()) }
  }
}

fun loadTrades(path: String): List<TradeRecord> {
  return try {
    File(path).readLines().mapNotNull { fromCsvTrade(it) }
  } catch(e: FileNotFoundException) {
    println("File trade logs tidak ditemukan.")
    emptyList()
  }
}

fun main() {
  val data = listOf(
    TradeRecord(1, "BTCUSDT", "Long", 90.0, 190.0),
    TradeRecord(2, "ETHUSDT", "Short", 88.0, 23.0)
  )
  saveTrades(data, "crypto_trades.csv")

  File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

  val loadedData = loadTrades("crypto_trades.csv")
  println("=== TRADE LOGS ===")
  loadedData.forEach { println(it) }
  val totalPnl = loadedData.sumOf { it.pnl }
  println("-> Total PnL BERSIH: $totalPnl")
}