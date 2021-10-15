package comportamentais.iterator

fun main() {

    val numbers = (1..20).toList()

    val iterator = PairIterator(numbers)

    while (iterator.hasNext()){
        println(iterator.next())
    }

}
