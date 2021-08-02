package estruturais.composite

abstract class Item(val description: String) {

    open fun open() {
        println("The item is $description")
    }

}