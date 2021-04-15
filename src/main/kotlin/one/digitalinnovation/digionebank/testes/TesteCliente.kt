package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val cliente =Cliente(
        nome = "Alexandre",
        cpf ="789.456.123-98",
        clienteTipo = ClienteTipo.PF,
        senha = "123456789"
    )
    println(cliente)
    TesteAutenticacao().autentica(cliente)
}