package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    var analista = Analista("João", "123.456.789-48", 2000.00)
    ImprimeRelatorioFuncionario.imprime(analista)
}