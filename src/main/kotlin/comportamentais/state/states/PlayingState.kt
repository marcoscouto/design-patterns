package comportamentais.state.states

import comportamentais.state.RemoteControl

class PlayingState(private val remoteControl: RemoteControl) : State(remoteControl) {

    override fun pressMainButton() {
        println("Stopping movie")
        remoteControl.changeState(StopState(remoteControl))
    }

}
