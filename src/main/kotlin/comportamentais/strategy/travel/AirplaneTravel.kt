package comportamentais.strategy.travel

import comportamentais.strategy.Travel

class AirplaneTravel: Travel {

    override fun execute() {
        println("traveling by airplane")
    }

}