package criacionais.singleton

class NewtonCalculator private constructor() {

    companion object {

        private val instance = NewtonCalculator()

        fun getInstance(): NewtonCalculator {
            return this.instance
        }

    }

    fun calculateForce(mass: Double, acceleration: Double): Double {
        return mass * acceleration
    }

    fun calculateMass(force: Double, acceleration: Double): Double {
        return force / acceleration
    }

    fun calculateAcceleration(force: Double, mass: Double): Double {
        return force / mass
    }

}