package me.bactoria.structural.facade

class WhiskeyApi {

	fun find(whiskeyName: String): WhiskeyResponse {
		return WhiskeyResponse(whiskeyName)
			.also { log("API Responsed: $it") }
	}
}

data class WhiskeyResponse(
	val whiskeyName: String
	// ...
)
