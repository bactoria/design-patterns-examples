package me.bactoria.behavioral.state

fun main() {
	Label5Maker()
		.run { processMalting() }
		.run { processMilling() }
		.run { processMashing() }
		.run { processFermentation() }
		.run { processDistillation() }
		.run { processAging() }
		.run { processBottling() }

	try {
		Label5Maker().processBottling()
	} catch (e: IllegalStateException) {
		assert(e.message.equals("숙성 상태이어야 합니다. 현재 상태: 준비"))
	}
}
