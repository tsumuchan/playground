package app.tsumuchan.playground.module1

data class SomeClass1(
    val freeSize: Int,
    val premiumSize: Int,
) {
    val totalSize = freeSize + premiumSize
}
