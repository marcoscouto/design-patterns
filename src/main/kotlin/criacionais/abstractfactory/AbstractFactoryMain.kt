package criacionais.abstractfactory

import criacionais.abstractfactory.montadora.Montadora
import criacionais.abstractfactory.montadora.MontadoraDeVeiculosComerciais
import criacionais.abstractfactory.montadora.MontadoraDeVeiculosMilitares

fun main() {

    val montadora: Montadora

    val option = "Comercial"

    montadora = when (option) {
        "Comercial" -> MontadoraDeVeiculosComerciais()
        else -> MontadoraDeVeiculosMilitares()
    }

    val veiculoAereo = montadora.criarVeiculoAereo()
    val veiculoTerrestre = montadora.criarVeiculoTerrestre()
    veiculoAereo.exibirTipoDoVeiculo()
    veiculoTerrestre.exibirTipoDoVeiculo()

}
