package comportamentais.strategy.travel

import comportamentais.strategy.Travel

class CarTravel : Travel {

    override fun execute() {
        println("traveling by car")
    }

}