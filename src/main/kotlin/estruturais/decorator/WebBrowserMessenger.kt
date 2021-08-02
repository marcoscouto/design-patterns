package estruturais.decorator

class WebBrowserMessenger : Messenger {

    override fun sendMessage(message: String) {
        println("Sending message from web browser: $message")
    }

}