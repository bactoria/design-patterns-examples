package me.bactoria.behavioral.templatemethod

abstract class WhiskeyMaker {

	fun create(): Whiskey {
		processMalting()
		processMilling()
		processMashing()
		processFermentation()
		processDistillation()
		processAging()
		return processBottling()
	}

	protected abstract fun processMalting()

	protected abstract fun processMilling()

	protected abstract fun processMashing()

	protected abstract fun processFermentation()

	protected abstract fun processDistillation()

	protected abstract fun processAging()

	protected abstract fun processBottling(): Whiskey
	
}

interface Whiskey
