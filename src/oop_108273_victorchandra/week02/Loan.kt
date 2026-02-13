package oop_108273_victorchandra.week02

class Loan(val bookString: String, val borrower: String, val loanDuration: Int = 1) {
  fun calculateFine(loanDuration: Int) = if(loanDuration > 3) (loanDuration - 3) * 2000 else 0

  init {
    print("\n-- DETAIL PEMINJAMAN --\nJudul Buku: $bookString\nNama Peminjam: $borrower\nDurasi Pinjam: $loanDuration hari\n")
    if(calculateFine(loanDuration) != 0)
      print("Denda: Rp ${calculateFine(loanDuration)}")
    else
      print("Tidak ada denda")
  }
}