package me.bactoria.structural.composite

fun main() {
	val whiskeyBreweries = WhiskeyBreweries()
	
	whiskeyBreweries.addBrewery(BallantineBrewery())
	whiskeyBreweries.addBrewery(Label5Brewery())
	
	whiskeyBreweries.makeWhiskey()
}
