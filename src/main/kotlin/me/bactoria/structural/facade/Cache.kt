package me.bactoria.structural.facade

class Cache<T> {
	private val cache = HashMap<String, T>()

	fun get(key: String): T? {
		return this.cache[key]
			.also { log("Cache Responsed: $it") }
	}

	fun set(key: String, value: T) {
		this.cache[key] = value
	}
}
