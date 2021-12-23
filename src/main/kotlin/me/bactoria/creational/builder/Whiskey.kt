package me.bactoria.creational.builder

class Whiskey(
	private val name: String,
	private val aged: String? = null,
	private val malt: String? = null,
	private val corn: String? = null,
	private val water: String
) {
	fun info(): String {
		return "$name + $aged + $malt + $corn + $water"
	}
}
