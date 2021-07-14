package criacionais.factorymethod.montadora

import criacionais.factorymethod.veiculo.Carro
import criacionais.factorymethod.veiculo.Veiculo

class MontadoraDeCarro : Montadora() {

    override fun criarVeiculo(): Veiculo {
        return Carro()
    }
}