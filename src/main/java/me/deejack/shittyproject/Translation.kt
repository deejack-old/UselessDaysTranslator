package me.deejack.shittyproject

import java.time.LocalDate

fun main() {
  var input: String?
  do {
    print("Insert lang(en, it): ")
    input = readLine()
    val wrongValue: Boolean = input != "it" && input != "en"
    if (wrongValue)
      println("Insert a correct lang: (en, it)\n")
  } while(wrongValue)
  printTranslatedDay(input!!)
}

fun firstLetterUp(text: String) =
  "${text[0]}${text.toLowerCase().substring(1)}"

fun printTranslatedDay(input: String) {
  printTranslatedDay(input, firstLetterUp(LocalDate.now().dayOfWeek.name))
}

fun printTranslatedDay(input: String, day: String) {
  val classPath = "me.deejack.shittyproject.$input.$day"
  val day = Class.forName(classPath).asSubclass(Day::class.java).getConstructor().newInstance()
  println(day.getName())
}