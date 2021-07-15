package estruturais.adapter.interno

import estruturais.adapter.externo.CalculadoraDeTributosExterna
import java.math.BigDecimal
import java.math.RoundingMode

class Adapter : ServicoExterno {

    private val calculadora = CalculadoraDeTributosExterna()

    override fun calcularInss(salario: Double): Double {
        val inss = calculadora.calcularInss(converterSalario(salario))
        return converterTributoParaRetorno(inss)
    }

    override fun calcularFgts(salario: Double): Double {
        val fgts = calculadora.calcularFgts(converterSalario(salario))
        return converterTributoParaRetorno(fgts)
    }

    private fun converterSalario(salario: Double): BigDecimal {
        return salario.toBigDecimal().setScale(2, RoundingMode.CEILING)
    }

    private fun converterTributoParaRetorno(tributo: BigDecimal): Double {
        return tributo.setScale(2, RoundingMode.CEILING).toDouble()
    }

}