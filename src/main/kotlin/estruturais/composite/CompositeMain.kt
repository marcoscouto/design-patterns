package estruturais.composite

fun main() {

    val videoGame = Object("video game")
    val tv = Object("tv")
    val rice = Object("rice")

    val videoGameBox = Box(listOf(videoGame), "video game box")
    val riceBox = Box(listOf(rice), "rice box")
    val tvBox = Box(listOf(tv), "tv box")

    val foodBox = Box(listOf(riceBox), "food box")
    val electronicsBox = Box(listOf(tvBox, videoGameBox), "medium box")

    val invoice = Object("invoice")

    val largeBox = Box(listOf(foodBox, electronicsBox, invoice), "large box")

    largeBox.open()

}
