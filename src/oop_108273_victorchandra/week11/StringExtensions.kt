package oop_108273_victorchandra.week11

fun String.addGreeting(): String {
  return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
  return this.repeat(n)
}