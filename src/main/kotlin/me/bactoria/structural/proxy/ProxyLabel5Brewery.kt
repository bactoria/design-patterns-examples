package me.bactoria.structural.proxy

class ProxyLabel5Brewery : Label5Brewery() {
	override fun makeWhiskey() {
		val start = System.currentTimeMillis()
		super.makeWhiskey()
		val end = System.currentTimeMillis()

		println("총 소요시간: ${end - start}")
	}
}
