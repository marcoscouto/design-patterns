package comportamentais.iterator

class Numbers(private val numbers: List<Int>) {

    fun iterator(): PairIterator {
        return PairIterator(this.numbers)
    }

}