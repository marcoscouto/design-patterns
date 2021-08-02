package estruturais.decorator.app

import estruturais.decorator.Messenger

open class AppMessenger : Messenger {

    override fun sendMessage(message: String) {
        println("Sending message from a mobile device")
    }

}