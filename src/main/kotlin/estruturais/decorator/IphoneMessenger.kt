package estruturais.decorator

class IphoneMessenger : AppMessenger() {

    override fun sendMessage(message: String) {
        super.sendMessage(message)
        println("Sending message from iphone app: $message")
    }

}