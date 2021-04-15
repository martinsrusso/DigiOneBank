package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)
    val digiOneBank2 = Banco(nome ="DigiOne2", numero =13)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    println(digiOneBank2.nome)
    println(digiOneBank2.numero)

    val digiOneBank3 = digiOneBank.copy(nome ="DigiOne3")
    println(digiOneBank3.info())
}