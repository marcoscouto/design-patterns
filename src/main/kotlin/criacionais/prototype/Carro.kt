package criacionais.prototype

class Carro(var marca: String, var modelo: String) {

    fun copy(): Carro {
        return Carro(this.marca, this.modelo)
    }

    fun print(): String {
        return "Marca: $marca\n" +
                "Modelo: $modelo\n"
    }

}