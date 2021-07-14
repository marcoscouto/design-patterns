package criacionais.factorymethod.montadora

import criacionais.factorymethod.veiculo.Caminhao
import criacionais.factorymethod.veiculo.Veiculo

class MontadoraDeCaminhao : Montadora() {

    override fun criarVeiculo(): Veiculo {
        return Caminhao()
    }

}