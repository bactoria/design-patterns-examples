package me.bactoria.creational.singleton

fun main() {
	println(EarlyWhiskyMaker.getInstance().makeBombay())
	println(LazyWhiskyMaker.getInstance().makeBombay())
	println(ObjectWhiskyMaker.makeBombay())
}
