package estruturais.decorator.app

import estruturais.decorator.app.AppMessenger

class IphoneMessenger : AppMessenger() {

    override fun sendMessage(message: String) {
        super.sendMessage(message)
        println("Sending message from iphone app: $message")
    }

}