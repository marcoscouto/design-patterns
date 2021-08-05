package comportamentais.command

import comportamentais.command.commands.LightOffCommand
import comportamentais.command.commands.LightOnCommand
import comportamentais.command.objects.Button
import comportamentais.command.objects.Light
import comportamentais.command.objects.RemoteControl

fun main() {

    val lamp = Light()

    val turnOnButton = Button("turn lamp on", LightOnCommand(lamp))

    val turnOffButton = Button("turn lamp off", LightOffCommand(lamp))

    val remoteControl = RemoteControl()
    remoteControl.addButton(turnOffButton)
    remoteControl.addButton(turnOnButton)

    println("lamp status: ${lamp.status}")

    remoteControl.selectButton("turn lamp on")?.command?.execute()

    println("lamp status: ${lamp.status}")


}