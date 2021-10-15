package comportamentais.iterator

class PairIterator(numbers: List<Int>) : Iterator<Int> {

    private var currentPosition: Int = 0
    var pairs: List<Int> = numbers.filter { it % 2 == 0 }

    override fun hasNext(): Boolean {
        return pairs.size != currentPosition
    }

    override fun next(): Int {
        return pairs[currentPosition++]
    }

}
