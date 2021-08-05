package comportamentais.observer.abstraction

abstract class Publisher {

    private val subscribers: MutableSet<Subscriber> = mutableSetOf()

    fun addSubscriber(subscriber: Subscriber) {
        this.subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber) {
        this.subscribers.remove(subscriber)
    }

    fun notifySubscribers(data: Data) {
        this.subscribers.forEach { it.update(data) }
    }

}
