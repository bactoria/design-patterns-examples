package me.bactoria.behavioral.templatemethod

fun main() {
	val label5Maker: WhiskeyMaker = Label5Maker()
	val dalmoreMaker: WhiskeyMaker = DalmoreMaker()

	val label5 = label5Maker.create()
	val dalmore = dalmoreMaker.create()

	println(label5)
	println(dalmore)
}
