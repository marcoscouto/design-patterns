package criacionais.singleton

fun main() {

    val calculator = NewtonCalculator.getInstance()

    val acceleration = calculator.calculateAcceleration(2.7, 20.3)
    val mass = calculator.calculateMass(9.8, 5.2887)
    val force = calculator.calculateForce(70.972, 4.988645)

    println("Acceleration result: $acceleration")
    println("Mass result: $mass")
    println("Force result: $force")

}
