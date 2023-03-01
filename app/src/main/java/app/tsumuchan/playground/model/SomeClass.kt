package app.tsumuchan.playground.model

data class SomeClass(
    val freeSize: Int,
    val premiumSize: Int,
) {
    val totalSize = freeSize + premiumSize
}
