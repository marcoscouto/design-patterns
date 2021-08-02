package estruturais.proxy.service

import estruturais.proxy.domain.Customer
import estruturais.proxy.domain.Sell

interface Service {

    fun process(sell: Sell, customer: Customer)

}