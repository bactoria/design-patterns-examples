package me.bactoria.creational.abstractfactory

class BourbonWhiskeyFactory: WhiskeyFactory {

	override fun makeWhiskey(whiskeyType: WhiskeyType, volume: Int): Whiskey {
		return when (whiskeyType) {
			WhiskeyType.JACK_DANIELS -> JackDaniels(volume)
			WhiskeyType.MAKERS_MARK -> MakersMark(volume)
			else -> throw IllegalArgumentException("$whiskeyType 은 버번 위스키가 아님.")
		}
	}
}
