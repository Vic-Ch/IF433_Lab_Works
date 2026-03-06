package oop_108273_victorchandra.week05

fun main() {
  val dosen1 = Dosen("Pak Alex", "0123456")
  val admin1 = Admin("Bu Siti")

  // polymorphic collection
  val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

  println("--- Aktivitas Pegawai ---")
  for (pegawai in daftarPegawai) {
    pegawai.bekerja()
//    pegawai.mengajar()

    when(pegawai) {
      is Dosen -> {
        println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
        pegawai.mengajar()
      }
      is Admin -> {
        println("-> Terdeteksi sebagai Admin")
        pegawai.doAdminWork()
      }
    }

    println("-------------------------")
  }
}