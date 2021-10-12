package comportamentais.templatemethod

class CarConstructor : VeiculeContructor() {

    override fun buildVeicule() {
        super.buildVeicule()
        println("[Car Constructor] building a car")
    }

}