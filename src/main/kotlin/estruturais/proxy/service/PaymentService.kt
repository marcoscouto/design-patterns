package estruturais.proxy.service

import estruturais.proxy.domain.Customer
import estruturais.proxy.domain.Sell

class PaymentService : Service {

    override fun process(sell: Sell, customer: Customer) {
        println("-- Order process is done --")
        println("Credit Card: ${sell.creditCard}")
        println("Value: ${sell.value}")
        println("Customer: ${customer.name}")
    }

}
