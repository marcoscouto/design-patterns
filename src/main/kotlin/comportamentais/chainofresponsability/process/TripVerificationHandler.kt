package comportamentais.chainofresponsability.process

import comportamentais.chainofresponsability.data.TripRequest
import comportamentais.chainofresponsability.handler.BaseHandler
import comportamentais.chainofresponsability.handler.Handler

class TripVerificationHandler(
    private val tripRequest: TripRequest,
    handler: Handler
) : BaseHandler(handler) {

    override fun handle() {

        if (tripRequest.distance <= 0) {
            throw IllegalArgumentException("distance must be positive")
        }

        super.next()
    }

}