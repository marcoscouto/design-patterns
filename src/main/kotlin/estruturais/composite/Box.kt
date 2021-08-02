package estruturais.composite

class Box(private val items: List<Item>, description: String) : Item(description) {

    override fun open() {
        super.open()
        println("Inside are the items: ${items.map { it.description }}")
        items.forEach {
            if (it is Box) {
                it.open()
            }
        }

    }

}