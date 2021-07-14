package criacionais.abstractfactory.montadora

import criacionais.abstractfactory.veiculo.AviaoComercial
import criacionais.abstractfactory.veiculo.CarroComercial
import criacionais.abstractfactory.veiculo.VeiculoAereo
import criacionais.abstractfactory.veiculo.VeiculoTerrestre

class MontadoraDeVeiculosComerciais : Montadora() {

    override fun criarVeiculoAereo(): VeiculoAereo {
        return AviaoComercial()
    }

    override fun criarVeiculoTerrestre(): VeiculoTerrestre {
        return CarroComercial()
    }
}