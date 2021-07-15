package estruturais.adapter.externo

import java.math.BigDecimal
import kotlin.Double.Companion.MAX_VALUE

class CalculadoraDeTributosExterna {

    fun calcularInss(salario: BigDecimal): BigDecimal {
        return salario.multiply(getAliquota(salario))
    }

    fun calcularFgts(salario: BigDecimal): BigDecimal {
        return salario.multiply(.08.toBigDecimal())
    }

    fun getAliquota(salario: BigDecimal): BigDecimal {
        assert(salario < 0.toBigDecimal())

        return when (salario) {
            in 0.toBigDecimal()..1100.00.toBigDecimal() -> .075.toBigDecimal()
            in 1100.01.toBigDecimal()..2203.48.toBigDecimal() -> .15.toBigDecimal()
            in 2203.49.toBigDecimal()..3305.22.toBigDecimal() -> .225.toBigDecimal()
            in 3305.23.toBigDecimal()..MAX_VALUE.toBigDecimal() -> .275.toBigDecimal()
            else -> throw ArithmeticException()
        }
    }

}