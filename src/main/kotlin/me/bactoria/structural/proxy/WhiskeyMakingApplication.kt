package me.bactoria.structural.proxy

object WhiskeyMakingApplication {
	fun run() {
		val proxy: WhiskeyBrewery = ProxyLabel5Brewery()
		proxy.makeWhiskey()
	}
}
