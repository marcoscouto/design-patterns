package criacionais.abstractfactory.montadora

import criacionais.abstractfactory.veiculo.AviaoMilitar
import criacionais.abstractfactory.veiculo.CarroMilitar
import criacionais.abstractfactory.veiculo.VeiculoAereo
import criacionais.abstractfactory.veiculo.VeiculoTerrestre

class MontadoraDeVeiculosMilitares : Montadora() {

    override fun criarVeiculoAereo(): VeiculoAereo {
        return AviaoMilitar()
    }

    override fun criarVeiculoTerrestre(): VeiculoTerrestre {
        return CarroMilitar()
    }
}