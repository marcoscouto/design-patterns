package estruturais.facade

fun main() {

    val product = Product("tv", 2000.00)

    Store.processBuy(product)

}