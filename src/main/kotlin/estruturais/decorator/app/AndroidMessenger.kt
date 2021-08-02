package estruturais.decorator.app

class AndroidMessenger : AppMessenger() {

    override fun sendMessage(message: String) {
        super.sendMessage(message)
        println("Sending message from android app: $message")
    }
}