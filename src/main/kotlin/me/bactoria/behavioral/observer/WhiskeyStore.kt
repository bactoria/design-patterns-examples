package me.bactoria.behavioral.observer

class WhiskeyStore : Subject() {
	private val whiskies: MutableList<Whiskey> = ArrayList()

	fun add(whiskey: Whiskey) {
		whiskies.add(whiskey)
		notifyObservers()
	}
}
