package comportamentais.memento

fun main(){

    val coordinates = Coordinates(7.9, 1.3)
    val backup = coordinates.createSnapshot()

    println("original coordinates: $coordinates")

    coordinates.x = 9.0
    coordinates.y = 5.3

    println("modified coordinates: $coordinates")

    backup.restore()

    println("restored coordinates: $coordinates")

}
