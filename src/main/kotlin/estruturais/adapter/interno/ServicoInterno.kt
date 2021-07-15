package estruturais.adapter.interno

class ServicoInterno(val servicoExterno: ServicoExterno) {

    fun calcularInssAnual(salario: Double): Double {
        val inss = servicoExterno.calcularInss(salario)
        return calcularValorAnualDeTributo(inss)
    }

    fun calcularFgtsAnual(salario: Double): Double {
        val fgts = servicoExterno.calcularFgts(salario)
        return calcularValorAnualDeTributo(fgts)
    }

    private fun calcularValorAnualDeTributo(tributo: Double): Double {
        return tributo * 12
    }

}