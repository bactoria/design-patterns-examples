package me.bactoria.creational.abstractfactory

fun main() {
	val bourbonFactory = BourbonWhiskeyFactory()
	val schotchFactory = SchotchWhiskeyFactory()

	val makersmark = make(bourbonFactory, WhiskeyType.MAKERS_MARK, 200)
	val glenfiddich = make(schotchFactory, WhiskeyType.GLENFIDDICH, 50)

	println(makersmark.name())
	println(glenfiddich.name())
}

fun make(
	whiskeyFactory: WhiskeyFactory, // 각 Factory를 WhiskeyFactory로 추상화 했음. => 추상 팩토리 패턴
	whiskeyType: WhiskeyType,
	volume: Int
): Whiskey {
	return whiskeyFactory.makeWhiskey(whiskeyType, volume)
}
