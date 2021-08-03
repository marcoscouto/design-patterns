package comportamentais.chainofresponsability.handler

interface Handler {

    fun next()

    fun handle()

}
