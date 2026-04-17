package oop_108273_victorchandra.week08

fun parseProduct(rawJson: Map<String, Any?>): Product? {
  val id = requireNotNull(rawJson["id"]) {
    "API Invalid: Missing ID"
  }

  val name = requireNotNull(rawJson["name"]) {
    "API Invalid: Missing Name"
  }

  val type: String = rawJson["type"].toString()

  if (type.uppercase() == "ELECTRONIC") {
    val warranty = rawJson["warranty"] as? Int ?: 12
    return Product.Electronic(id.toString(), name.toString(), warranty)
  } else if (type.uppercase() == "CLOTHING") {
    val size = rawJson["size"] as? String ?: "All Size"
    return Product.Clothing(id.toString(), name.toString(), size)
  } else {
    return null
  }
}