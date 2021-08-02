package estruturais.proxy

import estruturais.proxy.domain.Customer
import estruturais.proxy.domain.Sell
import estruturais.proxy.service.ProxyService

fun main() {

    val customer = Customer("John", "333-444-555")
    val firstSell = Sell(200.00, "333-444-555")
    val secondSell = Sell(100.00, "222-222-222")

    val service = ProxyService()

    println("Process first sell")
    service.process(firstSell, customer)

    println()

    println("Process second sell")
    service.process(secondSell, customer)


}