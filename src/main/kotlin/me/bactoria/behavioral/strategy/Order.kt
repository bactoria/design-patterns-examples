package me.bactoria.behavioral.strategy

class Order(val coupon: Coupon) {

	fun calculatePrice(price: Money): Money {
		return price - coupon()
	}
}

interface Coupon {
	operator fun invoke(): Money
}

object NoCoupon : Coupon {
	override operator fun invoke(): Money {
		return Money(0)
	}
}

object OneThousandWonCoupon : Coupon {
	override operator fun invoke(): Money {
		return Money(1000)
	}
}

object TenThousandWonCoupon : Coupon {
	override operator fun invoke(): Money {
		return Money(10000)
	}
}

class Money(val price: Int) {
	init {
		require(price >= 0)
	}

	operator fun minus(other: Money): Money {
		return this.price.minus(other.price)
			.run { Money(this) }
	}
}
