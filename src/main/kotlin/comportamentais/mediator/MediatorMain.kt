package comportamentais.mediator

import comportamentais.mediator.panel.Button
import comportamentais.mediator.panel.DigitalPanel
import comportamentais.mediator.panel.DigitalScreen

fun main() {

    val panel = DigitalPanel(null)

    val button = Button(panel)
    val screen = DigitalScreen(panel)

    panel.digitalScreen = screen

    button.operation()
    screen.operation()

    button.operation()
    screen.operation()
}