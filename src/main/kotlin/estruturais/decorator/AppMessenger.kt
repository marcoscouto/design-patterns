package estruturais.decorator

open class AppMessenger : Messenger {

    override fun sendMessage(message: String) {
        println("Sending message from a mobile device")
    }

}