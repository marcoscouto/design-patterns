package comportamentais.command.objects

class RemoteControl(private val buttons: MutableSet<Button> = mutableSetOf()) {

    fun addButton(button: Button) {
        this.buttons.add(button)
    }

    fun removeButton(button: Button) {
        this.buttons.remove(button)
    }

    fun selectButton(description: String): Button? {
        return this.buttons.find { it.description == description }
    }

}