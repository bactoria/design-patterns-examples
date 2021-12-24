package me.bactoria.creational.abstractfactory

class SchotchWhiskeyFactory: WhiskeyFactory {

	override fun makeWhiskey(whiskeyType: WhiskeyType, volume: Int): Whiskey {
		return when (whiskeyType) {
			WhiskeyType.GLENFIDDICH -> Glenfiddich(volume)
			else -> throw IllegalArgumentException("$whiskeyType 은 스카치 위스키가 아님.")
		}
	}
}
