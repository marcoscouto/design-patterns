package comportamentais.observer.restaurant

import comportamentais.observer.abstraction.Data
import comportamentais.observer.abstraction.Subscriber

class Billing : Subscriber {

    override fun update(data: Data) {

        if (data is Order) {
            println("Billing order ${data.description}")
            println("Total: ${data.quantity} x $ ${data.value} = $ ${data.calculateTotalValue()}")
        }

    }

}
