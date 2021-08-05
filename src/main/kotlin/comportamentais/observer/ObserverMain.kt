package comportamentais.observer

import comportamentais.observer.restaurant.Billing
import comportamentais.observer.restaurant.Hall
import comportamentais.observer.restaurant.Kitchen
import comportamentais.observer.restaurant.Order

fun main() {

    val hall = Hall()

    val kitchen = Kitchen()
    val billing = Billing()

    hall.addSubscriber(kitchen)
    hall.addSubscriber(billing)

    val order1 = Order(1, "Combo Super", 26.78, 2)
    val order2 = Order(2, "Combo Mega", 31.07, 5)

    hall.notifySubscribers(order1)

    println()

    hall.notifySubscribers(order2)

}
