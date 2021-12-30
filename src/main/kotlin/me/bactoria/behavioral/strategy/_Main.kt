package me.bactoria.behavioral.strategy

fun main() {
	println(Order(NoCoupon).calculatePrice(Money(1000)).price)
	println(Order(OneThousandWonCoupon).calculatePrice(Money(10000)).price)
	println(Order(TenThousandWonCoupon).calculatePrice(Money(15000)).price)
}
