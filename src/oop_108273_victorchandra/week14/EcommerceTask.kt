package oop_108273_victorchandra.week14

import java.io.File

//class BadOrderProcessor {
//  private val file = File("orders.csv")
//
//  fun processOrder(itemName: String, basePrice: Double, customerType:String) {
//    val finalPrice = when(customerType) {
//     "REGULAR" -> basePrice
//     "VIP" -> basePrice * 0.90
//     else -> basePrice
//    }
//    println("Memproses pesanan $itemName seharga $finalPrice")
//
//    file.appendText("$itemName,$finalPrice,$customerType\n")
//
//    println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
//  }
//}

interface OrderRepository {
  fun saveOrder(itemName: String, basePrice: Double, customerType:String)
}

class CsvOrderRepository(private val file: String = "orders.csv"): OrderRepository {
  override fun saveOrder(itemName: String, basePrice: Double, customerType: String) {
    File(file).printWriter().use { o ->
      o.appendLine("$itemName,$basePrice,$customerType")
    }
  }
}

interface NotificationService {
  fun sendNotification(msg: String)
}

class EmailNotifier: NotificationService {
  override fun sendNotification(msg: String) = println("Email terkirim: $msg")
}

class SafeOrderProcessor(
  private val repo: OrderRepository,
  private val notifier: NotificationService
) {
  fun processOrder(itemName: String, basePrice: Double, customerType: String) {
    val finalPrice = when (customerType) {
      "REGULAR" -> basePrice
      "VIP" -> basePrice * 0.90
      else -> basePrice
    }

    println("Memproses pesanan $itemName seharga $finalPrice")
    repo.saveOrder(itemName, finalPrice, customerType)
    notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
  }
}

fun main() {
  val repository = CsvOrderRepository()
  val emailService = EmailNotifier()
  val processor = SafeOrderProcessor(repository, emailService)
  processor.processOrder("Laptop", 1000.0, "VIP")
}