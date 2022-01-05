package me.bactoria.behavioral.observer

class WhiskeyMaker(private val whiskeyStore: WhiskeyStore) {

	fun make(whiskeyName: String) {
		return when (whiskeyName) {
			"label5" -> Label5()
			else -> throw IllegalArgumentException("위스키 이름 잘못됨. whiskeyName: $whiskeyName")
		}.let { whiskeyStore.add(it) }
	}

}

interface Whiskey

class Label5 : Whiskey
