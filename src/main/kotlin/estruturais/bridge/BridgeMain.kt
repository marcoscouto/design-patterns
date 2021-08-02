package estruturais.bridge

import estruturais.bridge.weapon.Gun
import estruturais.bridge.weapon.Sword

fun main() {

    val gun = Gun()
    val sword = Sword()

    val mainCharacter = GameCharacter(
        name = "Jim",
        accurate = 65.0,
        weapon = gun
    )

    mainCharacter.useWeapon()

    println("${mainCharacter.name} drop the gun...")
    println("${mainCharacter.name} pick a sword...")

    mainCharacter.weapon = sword

    mainCharacter.useWeapon()

}
