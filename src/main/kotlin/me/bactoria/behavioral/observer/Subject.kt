package me.bactoria.behavioral.observer

open class Subject {
	private val observers = ArrayList<Observer>()

	fun addObserver(observer: Observer) {
		observers.add(observer)
	}

	fun notifyObservers() {
		observers.forEach { it.update() }
	}
}
