package comportamentais.strategy

import comportamentais.strategy.travel.AirplaneTravel

fun main() {

    val context = TravelContext(AirplaneTravel())

    context.travel()

}