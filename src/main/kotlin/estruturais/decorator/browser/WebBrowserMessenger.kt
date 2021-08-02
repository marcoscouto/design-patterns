package estruturais.decorator.browser

import estruturais.decorator.Messenger

class WebBrowserMessenger : Messenger {

    override fun sendMessage(message: String) {
        println("Sending message from web browser: $message")
    }

}