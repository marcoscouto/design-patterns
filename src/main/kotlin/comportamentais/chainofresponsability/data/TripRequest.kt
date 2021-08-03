package comportamentais.chainofresponsability.data

data class TripRequest(val distance: Double, val user: User) {

    fun userHasBalanceForThisTrip() =
        this.user.balance >= calculateTripValue()

    private fun calculateTripValue() =
        this.distance * 2.34

}