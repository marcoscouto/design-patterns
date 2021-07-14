package criacionais.builder

data class Carro private constructor(
    val roda: String?,
    val cor: String?,
    val pneu: String?,
    val motor: String?,
    val amortecedor: String?,
    val escapamento: String?,
    val banco: String?,
    val volante: String?,
    val radio: String?
) {

    class CarroBuilder {

        companion object {

            private var roda: String? = null
            private var cor: String? = null
            private var pneu: String? = null
            private var motor: String? = null
            private var amortecedor: String? = null
            private var escapamento: String? = null
            private var banco: String? = null
            private var volante: String? = null
            private var radio: String? = null

            fun setRoda(roda: String): Companion {
                this.roda = roda
                return this
            }

            fun setCor(cor: String): Companion {
                this.cor = cor
                return this
            }

            fun setPneu(pneu: String): Companion {
                this.pneu = pneu
                return this
            }

            fun setMotor(motor: String): Companion {
                this.motor = motor
                return this
            }

            fun setAmortecedor(amortecedor: String): Companion {
                this.amortecedor = amortecedor
                return this
            }

            fun setEscapamento(escapamento: String): Companion {
                this.escapamento = escapamento
                return this
            }

            fun setBanco(banco: String): Companion {
                this.banco = banco
                return this
            }

            fun setVolante(volante: String): Companion {
                this.volante = volante
                return this
            }

            fun setRadio(radio: String): Companion {
                this.banco = banco
                return this
            }

            fun build(): Carro {
                return Carro(
                    this.roda,
                    this.cor,
                    this.pneu,
                    this.motor,
                    this.amortecedor,
                    this.escapamento,
                    this.banco,
                    this.volante,
                    this.radio
                )
            }
        }

    }

}