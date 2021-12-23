package me.bactoria.creational.singleton

class EarlyWhiskyMaker {

	fun makeBombay(): String {
		return "bombay"
	}

	companion object {
		private val singleton = EarlyWhiskyMaker()

		fun getInstance(): EarlyWhiskyMaker {
			return singleton
		}
	}

}
