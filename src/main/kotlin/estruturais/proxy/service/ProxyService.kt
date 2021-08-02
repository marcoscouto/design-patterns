package estruturais.proxy.service

import estruturais.proxy.domain.Customer
import estruturais.proxy.domain.Sell

class ProxyService : Service {

    private val service = PaymentService()

    override fun process(sell: Sell, customer: Customer) {
        if (sell.creditCard == customer.creditCard) {
            service.process(sell, customer)
        } else {
            println("Process refused, check all information")
        }
    }

}