package oop_108273_victorchandra.week12

fun dispenceKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
  require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
//  if (availableGram < requestedGram) throw FoodEmptyException(availableGram, requestedGram)
//  if (isJammed) throw DispenserJamException()
  var x = availableGram
  x -= requestedGram
  return x
}