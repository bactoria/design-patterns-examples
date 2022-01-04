package me.bactoria.structural.facade

fun main() {
	val whiskeyRepository = run {
		val cache = Cache<WhiskeyResponse>()
		val whiskeyApi = WhiskeyApi()
		WhiskeyRepository(cache, whiskeyApi)
	}

	whiskeyRepository.findByName("label5")
	whiskeyRepository.findByName("label5")
}

fun log(msg: String) = println(msg)
