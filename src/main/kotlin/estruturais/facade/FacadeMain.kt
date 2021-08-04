package estruturais.facade

fun main() {

    val product = Product("tv", 2000.00)

    val store = Store()

    store.processBuy(product)

}