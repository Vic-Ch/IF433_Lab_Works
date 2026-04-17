package oop_108273_victorchandra.week08

class NotificationService {
  fun sendEmail(emailAddress: String) {
    println("Mengirim email ke $emailAddress")
  }

  fun process(user: UserProfile) {
//    sendEmail(user.email)

    if (user.email != null) {
      sendEmail(user.email)
    } else {
      println("User ${user.name} tidak memiliki email.")
    }
  }
}