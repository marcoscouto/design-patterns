package estruturais.decorator.app

import estruturais.decorator.Messenger

abstract class AppMessenger(private val messenger: Messenger?) : Messenger {

    override fun sendMessage(message: String) {
        messenger?.sendMessage(message)
    }

}