package me.bactoria.creational.singleton

class LazyWhiskyMaker {

	fun makeBombay(): String {
		return "bombay"
	}

	companion object {
		private var singleton: LazyWhiskyMaker? = null

		fun getInstance(): LazyWhiskyMaker =
			singleton ?: synchronized(this) {
				singleton ?: LazyWhiskyMaker().also { singleton = it }
			}
	}
}
