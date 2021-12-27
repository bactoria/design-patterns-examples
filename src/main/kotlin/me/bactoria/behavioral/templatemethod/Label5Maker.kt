package me.bactoria.behavioral.templatemethod

class Label5Maker : WhiskeyMaker() {

	override fun processMalting() {
		println("Label5 Malting...")
	}

	override fun processMilling() {
		println("Label5 Milling...")
	}

	override fun processMashing() {
		println("Label5 Mashing...")
	}

	override fun processFermentation() {
		println("Label5 Fermentation...")
	}

	override fun processDistillation() {
		println("Label5 Distillation...")
	}

	override fun processAging() {
		println("Label5 Aging...")
	}

	override fun processBottling(): Label5 {
		return Label5()
	}
}

class Label5 : Whiskey
