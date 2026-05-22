package oop_108273_victorchandra.week13

import java.io.File

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