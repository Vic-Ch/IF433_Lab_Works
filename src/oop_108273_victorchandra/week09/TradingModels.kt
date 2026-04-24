package oop_108273_victorchandra.week09

import javax.swing.text.Position

data class TradeLog(
  val pair: String, val position: String,
  val leverage: Int, val roe: Double, val status: String
)