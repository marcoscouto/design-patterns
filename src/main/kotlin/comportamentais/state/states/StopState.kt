package comportamentais.state.states

import comportamentais.state.RemoteControl

class StopState(private val remoteControl: RemoteControl) : State(remoteControl) {

    override fun pressMainButton() {
        println("Starting movie")
        remoteControl.changeState(PlayingState(remoteControl))
    }

}
