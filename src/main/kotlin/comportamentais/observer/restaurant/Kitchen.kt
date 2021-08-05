package comportamentais.observer.restaurant

import comportamentais.observer.abstraction.Data
import comportamentais.observer.abstraction.Subscriber

class Kitchen : Subscriber {

    override fun update(data: Data) {

        if (data is Order) {
            println("Order ${data.number} received on kitchen")
            println("Preparing ${data.quantity} of ${data.description}")
        }

    }


}
