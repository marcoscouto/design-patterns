package comportamentais.mediator

abstract class Component(private val mediator: Mediator) {

    fun operation() {
        mediator.notifier(this)
    }

}