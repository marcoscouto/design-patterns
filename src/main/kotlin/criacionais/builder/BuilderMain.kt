package criacionais.builder

fun main() {

    val carro = Carro.CarroBuilder
        .setCor("Azul")
        .setMotor("2.0")
        .setRadio("Pioneer")
        .build()

    println(carro)

}