package estruturais.decorator

import estruturais.decorator.app.AndroidMessenger
import estruturais.decorator.app.IphoneMessenger
import estruturais.decorator.browser.WebBrowserMessenger

fun main() {

    val message = "Hello!!"

    var messenger: Messenger = WebBrowserMessenger()

    messenger.sendMessage(message)

    messenger = AndroidMessenger()

    messenger.sendMessage(message)

    messenger = IphoneMessenger()

    messenger.sendMessage(message)


}