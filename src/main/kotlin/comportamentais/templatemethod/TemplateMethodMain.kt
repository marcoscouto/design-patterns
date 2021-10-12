package comportamentais.templatemethod

fun main() {

    var constructor: VeiculeContructor

    constructor = AirplaneConstructor()
    constructor.buildVeicule()

    constructor = CarConstructor()
    constructor.buildVeicule()

}
