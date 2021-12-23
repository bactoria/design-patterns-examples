package me.bactoria.creational.builder

fun main() {
	val firstWhiskey = Whiskey(
		name = "johnnie walker",
		malt = "20g",
		water = "100ml"
	)

	val secondWhiskey = Whiskey(
		name = "jameson",
		corn = "100g",
		water = "100ml",
		aged = "15year"
	)

	println(firstWhiskey.info())
	println(secondWhiskey.info())
}
