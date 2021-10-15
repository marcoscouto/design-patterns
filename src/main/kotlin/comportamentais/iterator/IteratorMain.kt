package comportamentais.iterator

fun main() {

    val numbers = Numbers((1..20).toList())

    val iterator = numbers.iterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }

}
