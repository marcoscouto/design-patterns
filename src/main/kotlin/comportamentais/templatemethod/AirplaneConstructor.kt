package comportamentais.templatemethod

class AirplaneConstructor : VeiculeContructor() {

    override fun buildVeicule() {
        super.buildVeicule()
        println("[Car Constructor] building a aiplane")
    }

}