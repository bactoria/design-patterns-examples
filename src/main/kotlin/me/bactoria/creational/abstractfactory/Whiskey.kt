package me.bactoria.creational.abstractfactory

interface Whiskey {
	fun name(): String
	fun alcoholByVolume(): String
}

class Glenfiddich(private val volume: Int): Whiskey {
	private val name = "Glenfiddich"
	private val alcoholByVolume = "40%"

	override fun name(): String {
		return name
	}

	override fun alcoholByVolume(): String {
		return alcoholByVolume
	}
}

class JackDaniels(private val volume: Int): Whiskey {
	private val name = "Jack Daniel's"
	private val alcoholByVolume = "40%"

	override fun name(): String {
		return name
	}

	override fun alcoholByVolume(): String {
		return alcoholByVolume
	}
}

class MakersMark(private val volume: Int): Whiskey {
	private val name = "Maker's Mark"
	private val alcoholByVolume = "40%"

	override fun name(): String {
		return name
	}

	override fun alcoholByVolume(): String {
		return alcoholByVolume
	}
}
