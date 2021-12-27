package me.bactoria.creational.factorymethod

import java.util.*

fun main() {
	val glenfiddich = WhiskeyFactory.createWhiskey("Glenfiddich")
	val label5 = WhiskeyFactory.createWhiskey("Label5")
	val bombay = WhiskeyFactory.createWhiskey("Bombay")

	println(glenfiddich)
	println(label5)
	println(bombay)
}

object WhiskeyFactory {
	fun createWhiskey(name: String): Whiskey {
		return when (name.trim().lowercase(Locale.getDefault())) {
			"glenfiddich" -> Glenfiddich()
			"label5" -> Label5()
			"bombay" -> Bombay()
			else -> throw IllegalArgumentException("지원하지 않는 위스키입니다. name: $name")
		}
	}
}

interface Whiskey

class Glenfiddich : Whiskey

class Label5 : Whiskey, me.bactoria.behavioral.templatemethod.Whiskey

class Bombay : Whiskey
