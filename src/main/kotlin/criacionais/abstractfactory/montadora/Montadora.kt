package criacionais.abstractfactory.montadora

import criacionais.abstractfactory.veiculo.VeiculoAereo
import criacionais.abstractfactory.veiculo.VeiculoTerrestre

abstract class Montadora {

    abstract fun criarVeiculoAereo(): VeiculoAereo

    abstract fun criarVeiculoTerrestre(): VeiculoTerrestre

}