package comportamentais.state.states

import comportamentais.state.RemoteControl

abstract class State(private var remoteControl: RemoteControl) {

    abstract fun pressMainButton()

}