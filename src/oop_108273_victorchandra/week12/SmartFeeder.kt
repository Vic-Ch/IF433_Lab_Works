package oop_108273_victorchandra.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
  require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

  if (isJammed) throw FeedersExceptions.DispenserJamException()
  if (availableGram < requestedGram) throw FeedersExceptions.FoodEmptyException(requestedGram, availableGram)

  println("Kibble berhasil dikeluarkan!")

  return availableGram - requestedGram
}

fun main() {
  var currentKibbleStock = 10
  try {
    dispenseKibble(80, currentKibbleStock, false)
  } catch (e: FeedersExceptions.DispenserJamException) {
    println("Dispenser Error: ${e.message}")
  } catch (e: FeedersExceptions.FoodEmptyException) {
    println("Food Empty Error: ${e.message}")
  } catch (e: Exception) {
    println("General Error: ${e.message}")
  } finally {
    println("Siklus pengecekan dispenser pagi selesai.")
  }

  val valid: Result<Int> = runCatching {
    dispenseKibble(30, 1000, false)
  }.onSuccess { newStock ->
    currentKibbleStock = newStock
    println("Makan sore sukses! Sisa stock kibble $currentKibbleStock")
  }.onFailure { error ->
    println("Peringatan ke Pemilik: ${error.message}")
    println("Opsional: Berikan chicken jerky secara manual")
  }

  println("Hasil: $valid")
}