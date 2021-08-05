package comportamentais.mediator.panel

import comportamentais.mediator.Component
import comportamentais.mediator.Mediator

class DigitalPanel(
    var digitalScreen: DigitalScreen?
) : Mediator {

    override fun notifier(component: Component) {
        when (component) {
            is DigitalScreen -> println(digitalScreen?.number)
            is Button -> digitalScreen?.increntNumber()
        }
    }

}