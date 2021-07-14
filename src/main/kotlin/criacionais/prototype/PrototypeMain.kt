package criacionais.prototype

fun main() {

    val carro = Carro("Honda", "Fit")
    val carroObject = carro
    val carroCopy = carro.copy()

    println("Alocação na memória")
    println("Carro: $carro")
    println("Carro Object: $carroObject")
    println("Carro Copy: $carroCopy")
    println()

    println("Comparação de Objetos:")
    println("Carro == Carro Object: ${carro == carroObject}")
    println("Carro == Carro Copy: ${carro == carroCopy}")
    println()

    println("Mudando carro object...")
    carroObject.marca = "Toyota"
    carroObject.modelo = "Etios"
    println()

    println("Carro: ${carro.print()}")

}