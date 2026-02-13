package oop_108273_victorchandra.week02

class Loan(val bookString: String, val borrower: String, val loanDuration: Int = 1) {
  fun calculateFine(loanDuration: Int) = if(loanDuration > 3) (loanDuration - 3) * 2000 else 0
}