package comportamentais.chainofresponsability.handler

abstract class BaseHandler(private val handler: Handler?) : Handler {

    override fun next() {
        handler?.handle()
    }

}
