package estruturais.facade

import kotlin.random.Random

class FinancingDepartment {

    companion object {

        fun processPayment() {
            println("Processing payment...")
            println("Payment process is finished")
        }

        fun createInvoice(product: Product) {
            println("Invoice n.${Random(0).nextInt(0, 100)}: $product")
        }

    }

}