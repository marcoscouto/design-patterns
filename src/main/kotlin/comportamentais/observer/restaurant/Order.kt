package comportamentais.observer.restaurant

import comportamentais.observer.abstraction.Data

data class Order(
    val number: Int,
    val description: String,
    val value: Double,
    val quantity: Int
) : Data {

    fun calculateTotalValue() = quantity * value

}
