package comportamentais.templatemethod

abstract class VeiculeContructor {

    open fun buildVeicule(){
        println("[Veicule Contructor] buy materials")
    }

}