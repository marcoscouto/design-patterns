package estruturais.adapter.interno

interface ServicoExterno {

    fun calcularInss(salario: Double): Double

    fun calcularFgts(salario: Double): Double

}