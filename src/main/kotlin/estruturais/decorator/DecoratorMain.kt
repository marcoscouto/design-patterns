package estruturais.decorator

fun main() {

    val message = "Hello!!"

    var messenger: Messenger = WebBrowserMessenger()

    messenger.sendMessage(message)

    messenger = AndroidMessenger()

    messenger.sendMessage(message)

    messenger = IphoneMessenger()

    messenger.sendMessage(message)


}