package comportamentais.strategy

import comportamentais.strategy.Travel

class TravelContext(private val travel: Travel) {

    fun travel() = travel.execute()

}