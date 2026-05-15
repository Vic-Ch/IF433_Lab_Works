package oop_108273_victorchandra.week12

sealed class FeedersExceptions(msg: String): Exception(msg) {
  class FoodEmptyException(requested: Int, available: Int): FeedersExceptions("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")
  class DispenserJamException: FeedersExceptions("Wadah dispender tersangkut/macet!")
}