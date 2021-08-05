package comportamentais.mediator.panel

import comportamentais.mediator.Component

class DigitalScreen(
    digitalPanel: DigitalPanel,
    var number: Int = 0
) : Component(digitalPanel) {

    fun increntNumber() {
        number++
    }

}
