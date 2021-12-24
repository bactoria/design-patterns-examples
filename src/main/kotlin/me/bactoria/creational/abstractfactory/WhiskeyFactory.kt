package me.bactoria.creational.abstractfactory

interface WhiskeyFactory {

	fun makeWhiskey(whiskeyType: WhiskeyType, volume: Int): Whiskey
}
