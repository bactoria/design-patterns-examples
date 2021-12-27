package me.bactoria.behavioral.templatemethod

class DalmoreMaker : WhiskeyMaker() {

	override fun processMalting() {
		println("Dalmore Malting...")
	}

	override fun processMilling() {
		println("Dalmore Milling...")
	}

	override fun processMashing() {
		println("Dalmore Mashing...")
	}

	override fun processFermentation() {
		println("Dalmore Fermentation...")
	}

	override fun processDistillation() {
		println("Dalmore Distillation...")
	}

	override fun processAging() {
		println("Dalmore Aging...")
	}

	override fun processBottling(): Dalmore {
		return Dalmore()
	}
}

class Dalmore : Whiskey
