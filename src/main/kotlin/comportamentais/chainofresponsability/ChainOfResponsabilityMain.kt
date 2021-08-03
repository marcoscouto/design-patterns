package comportamentais.chainofresponsability

import comportamentais.chainofresponsability.data.TripRequest
import comportamentais.chainofresponsability.data.User
import comportamentais.chainofresponsability.process.TripService
import comportamentais.chainofresponsability.process.TripVerificationHandler
import comportamentais.chainofresponsability.process.UserVerificationHandler

fun main() {

    val user = User("Billy", 25, 200.00)
    val tripRequest = TripRequest(1.6, user)

    val tripService = TripService(tripRequest)

    val tripHandler = TripVerificationHandler(tripRequest, tripService)
    val userHandler = UserVerificationHandler(tripRequest, tripHandler)

    userHandler.handle()

}
