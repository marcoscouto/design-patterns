package estruturais.bridge

import estruturais.bridge.weapon.Weapon

data class GameCharacter(val name: String, val accurate: Double, var weapon: Weapon) {

    fun useWeapon() {
        println("$name make the move: ${weapon.use()}")
    }

}