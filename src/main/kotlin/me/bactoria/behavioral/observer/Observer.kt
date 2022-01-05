package me.bactoria.behavioral.observer

interface Observer {
	fun update()
}

object Email : Observer {
	override fun update() {
		println("Send Email")
	}
}

object KakaoTalk : Observer {
	override fun update() {
		println("Send KakaoTalk")
	}
}
