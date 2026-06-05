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

interface PricingStrategy {
  fun calculatePrice(price: Double): Double
}

class VipPricing: PricingStrategy {
  override fun calculatePrice(price: Double): Double {
    return price * 0.90
  }
}

class RegularPricing: PricingStrategy {
  override fun calculatePrice(price: Double): Double {
    return price
  }
}

class SafeOrderProcessor(
  private val repo: OrderRepository,
  private val notifier: NotificationService
) {
  fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
    val finalPrice = pricing.calculatePrice(basePrice)

    println("Memproses pesanan $itemName seharga $finalPrice")

    val strategyName = pricing::class.simpleName ?: "UNKNOWN"

    repo.saveOrder(itemName, finalPrice, strategyName)
    notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
  }
}

fun main() {
  val repository = CsvOrderRepository()
  val emailService = EmailNotifier()
  val processor = SafeOrderProcessor(repository, emailService)

  val vipStrategy = VipPricing()
  processor.processOrder("Ayam", 1000.0, vipStrategy)

  val regularStrategy = RegularPricing()
  processor.processOrder("Bebek", 555.0, regularStrategy)
}