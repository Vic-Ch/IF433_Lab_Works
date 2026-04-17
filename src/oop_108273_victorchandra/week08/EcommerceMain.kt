package oop_108273_victorchandra.week08

fun main() {
  val rawApiData: List<Map<String, Any?>> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "NotAn Integer"), // Corrupted warranty
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
  )

  val api = ApiParser()

  for (r in rawApiData) {
    try {
      val product = api.parseProduct(r)
      product?.let {
        api.checkOut(product)
        print(": $product \n")
      } ?: println("Skipped due to not found field.")
    } catch (e: IllegalArgumentException) {
      println(e.message)
    }
  }
}