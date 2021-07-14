package criacionais.factorymethod.montadora

import criacionais.factorymethod.veiculo.Veiculo

abstract class Montadora {

    abstract fun criarVeiculo(): Veiculo

}