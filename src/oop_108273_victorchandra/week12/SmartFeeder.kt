package oop_108273_victorchandra.week12

fun dispenceKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
  require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
//  if (isJammed) throw DispenserJamException()
  var x = availableGram

  if (x < requestedGram) throw FoodEmptyException(availableGram, requestedGram)

  x -= requestedGram
  return x
}