package me.bactoria.behavioral.observer

fun main() {
	val whiskeyStore = WhiskeyStore().apply {
		addObserver(Email)
		addObserver(KakaoTalk)
	}

	val whiskeyMaker = WhiskeyMaker(whiskeyStore)
	whiskeyMaker.make("label5")
}
