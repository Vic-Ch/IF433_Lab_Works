package oop_108273_victorchandra.week05

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
  override fun bekerja() {
    println("[$nama] sedang menyiapkan materi")
  }

  fun mengajar() {
    println("[$nama] sedang mengajar mahasiswa di kelas.")
  }
}