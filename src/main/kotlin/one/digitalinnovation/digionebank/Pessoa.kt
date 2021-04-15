package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Leo"
    var cpf: String = "111.111.111-11"
    private set
}

fun main() {
    val _pessoa = Pessoa()
    println(_pessoa.nome)
    println(_pessoa.cpf)

}