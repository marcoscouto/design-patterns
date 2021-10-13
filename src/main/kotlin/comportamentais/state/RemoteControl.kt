package comportamentais.state

import comportamentais.state.states.State
import comportamentais.state.states.StopState

class RemoteControl {

    private var state: State

    init {
        state = StopState(this)
    }

    fun pressMainButton() {
        state.pressMainButton()
    }

    fun changeState(state: State) {
        this.state = state
    }

}
