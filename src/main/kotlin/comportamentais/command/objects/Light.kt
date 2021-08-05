package comportamentais.command.objects

class Light {

    var status = Status.OFF

    fun turnOn() {
        status = Status.ON
    }

    fun turnOff() {
        status = Status.ON
    }

    enum class Status { ON, OFF }

}