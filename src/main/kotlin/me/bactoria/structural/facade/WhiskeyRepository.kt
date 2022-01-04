package me.bactoria.structural.facade

class WhiskeyRepository(private val cache: Cache<WhiskeyResponse>, private val whiskeyApi: WhiskeyApi) {

	fun findByName(whiskeyName: String): WhiskeyResponse {
		val cacheKey = "$PREFIX$whiskeyName"

		return cache.get(cacheKey)
			?: whiskeyApi.find(whiskeyName).also { cache.set(cacheKey, it) }
	}

	companion object {
		private const val PREFIX = "WHISKEY_"
	}

}
