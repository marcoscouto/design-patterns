package comportamentais.chainofresponsability.process

import comportamentais.chainofresponsability.data.TripRequest
import comportamentais.chainofresponsability.handler.BaseHandler

class TripService(
    private val tripRequest: TripRequest
) : BaseHandler(null) {

    override fun handle() {
        println("trip process successfully $tripRequest")
    }

}