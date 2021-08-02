package estruturais.flyweight

fun main() {

    val mall = Mall(mutableSetOf())

    val amazon = StoreType("Amazon", "Marketplace")
    val amazonStore = Store(1, 2, amazon)

    mall.addStore(amazonStore)

    println(mall)

}