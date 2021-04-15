package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    var gerente = Gerente("Maria", "123.456.789-48", 2000.00, "senha123")
    ImprimeRelatorioFuncionario.imprime(gerente)

    TesteAutenticacao().autentica(gerente)
}
