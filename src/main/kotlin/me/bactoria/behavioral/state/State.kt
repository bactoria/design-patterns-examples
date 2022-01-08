package me.bactoria.behavioral.state

enum class State(val value: String) {
	READY("준비"),
	MALTING("맥아 제조"),
	MILLING("분쇄"),
	MASHING("당화"),
	FERMENTATION("발효"),
	DISTILLATION("증류"),
	AGING("숙성");
}
