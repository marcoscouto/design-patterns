package comportamentais.memento

class Snapshot(
    private val coordinates: Coordinates,
    private val x: Double,
    private val y: Double
) {

    fun restore() {
        coordinates.x = this.x
        coordinates.y = this.y
    }

}