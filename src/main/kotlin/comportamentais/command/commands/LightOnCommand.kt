package comportamentais.command.commands

import comportamentais.command.objects.Light

class LightOnCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOn()
    }

    override fun undo() {
        light.turnOff()
    }

}