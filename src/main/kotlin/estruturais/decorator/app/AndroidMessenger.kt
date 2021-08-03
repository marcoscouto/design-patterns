package estruturais.decorator.app

import estruturais.decorator.Messenger

class AndroidMessenger(messenger: Messenger?) : AppMessenger(messenger) {

    override fun sendMessage(message: String) {
        super.sendMessage(message)
        println("Sending message from android app: $message")
    }
}