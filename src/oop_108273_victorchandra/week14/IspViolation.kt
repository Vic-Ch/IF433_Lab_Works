package oop_108273_victorchandra.week14

interface MultiFunctionDevice {
  fun print(doc: String)
  fun scan(doc: String): String
  fun fax(doc: String)
}

class SimplePrinter: MultiFunctionDevice {
  override fun print(doc: String) = println("Printing: $doc")
  override fun scan(doc: String) = throw UnsupportedOperationException("No Scanner")
  override fun fax(doc: String) = throw UnsupportedOperationException("No fax")
}