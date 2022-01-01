package me.bactoria.structural.composite

class WhiskeyBreweries : WhiskeyBrewery {

	private val whiskeyBreweries: MutableList<WhiskeyBrewery> = mutableListOf()

	override fun makeWhiskey() {
		whiskeyBreweries.forEach { it.makeWhiskey() }
	}

	fun addBrewery(whiskeyBrewery: WhiskeyBrewery) {
		whiskeyBreweries.add(whiskeyBrewery)
	}
}
