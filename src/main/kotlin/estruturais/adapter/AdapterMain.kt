package estruturais.adapter

import estruturais.adapter.interno.Adapter
import estruturais.adapter.interno.ServicoInterno

fun main() {

    val adapter = Adapter()
    val servicoInterno = ServicoInterno(adapter)

    val salario = 5300.00

    val inssAnual = servicoInterno.calcularInssAnual(salario)
    val fgtsAnual = servicoInterno.calcularFgtsAnual(salario)

    println("Valores anuais para salário de $salario")
    println("Inss: $inssAnual")
    println("Fgts: $fgtsAnual")

}