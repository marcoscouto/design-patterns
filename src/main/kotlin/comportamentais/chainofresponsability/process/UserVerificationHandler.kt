package comportamentais.chainofresponsability.process

import comportamentais.chainofresponsability.data.TripRequest
import comportamentais.chainofresponsability.handler.BaseHandler
import comportamentais.chainofresponsability.handler.Handler

class UserVerificationHandler(
    private val tripRequest: TripRequest,
    handler: Handler?
) : BaseHandler(handler) {

    override fun handle() {

        if (!tripRequest.userHasBalanceForThisTrip()) {
            throw IllegalArgumentException("user hasn't money enough")
        }

        super.next()

    }

}