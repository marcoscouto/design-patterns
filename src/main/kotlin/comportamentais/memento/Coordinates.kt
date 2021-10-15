package comportamentais.memento

data class Coordinates(
    var x: Double,
    var y: Double
) {

    fun createSnapshot() = Snapshot(this, this.x, this.y)

}
