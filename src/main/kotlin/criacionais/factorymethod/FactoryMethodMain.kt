package criacionais.factorymethod

import criacionais.factorymethod.montadora.Montadora
import criacionais.factorymethod.montadora.MontadoraDeCaminhao
import criacionais.factorymethod.montadora.MontadoraDeCarro

fun main() {

    val montadora: Montadora

    val option = "Caminhao"

    montadora = when (option) {
        "Caminhao" -> MontadoraDeCaminhao()
        else -> MontadoraDeCarro()
    }

    val veiculo = montadora.criarVeiculo()
    veiculo.exibirTipoDoVeiculo()

}