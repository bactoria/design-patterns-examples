package me.bactoria.structural.proxy

open class Label5Brewery : WhiskeyBrewery {
	override fun makeWhiskey() {
		Thread.sleep(100)
			.also { println("Label5 Created...") }
	}
}
