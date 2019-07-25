import me.deejack.shittyproject.printTranslatedDay
import java.time.LocalDate

fun main() {
  val days = arrayOf("Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday", "Sunday")
  println("en:")
  for (day in days) {
    printTranslatedDay("en", day)
  }
  println("it:")
  for (day in days) {
    printTranslatedDay("it", day)
  }
}