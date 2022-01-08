package me.bactoria.behavioral.state

interface WhiskeyMaker

class Label5Maker private constructor(private val state: State) : WhiskeyMaker {
	constructor() : this(State.READY)

	fun processMalting(): Label5Maker {
		check(this.state == State.READY) { illegalStateMessage(State.READY) }
		return Label5Maker(State.MALTING)
	}

	fun processMilling(): Label5Maker {
		check(this.state == State.MALTING) { illegalStateMessage(State.MALTING) }
		return Label5Maker(State.MILLING)
	}

	fun processMashing(): Label5Maker {
		check(this.state == State.MILLING) { illegalStateMessage(State.MILLING) }
		return Label5Maker(State.MASHING)
	}

	fun processFermentation(): Label5Maker {
		check(this.state == State.MASHING) { illegalStateMessage(State.MASHING) }
		return Label5Maker(State.FERMENTATION)
	}

	fun processDistillation(): Label5Maker {
		check(this.state == State.FERMENTATION) { illegalStateMessage(State.FERMENTATION) }
		return Label5Maker(State.DISTILLATION)
	}

	fun processAging(): Label5Maker {
		check(this.state == State.DISTILLATION) { illegalStateMessage(State.DISTILLATION) }
		return Label5Maker(State.AGING)
	}

	fun processBottling(): List<Label5> {
		check(this.state == State.AGING) { illegalStateMessage(State.AGING) }
		return listOf(Label5(), Label5())
	}

	private fun illegalStateMessage(mustState: State) = "${mustState.value} 상태이어야 합니다. 현재 상태: ${this.state.value}"
}
