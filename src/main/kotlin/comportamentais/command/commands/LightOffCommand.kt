package comportamentais.command.commands

import comportamentais.command.objects.Light

class LightOffCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOff()
    }

    override fun undo() {
        light.turnOn()
    }

}