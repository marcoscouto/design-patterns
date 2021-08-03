package estruturais.decorator.app

import estruturais.decorator.Messenger

class IphoneMessenger(messenger: Messenger?) : AppMessenger(messenger) {

    override fun sendMessage(message: String) {
        super.sendMessage(message)
        println("Sending message from iphone app: $message")
    }

}