package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Leo"
    var cpf: String = "111.111.111-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome:$nome - CPF:$cpf"
}

fun main() {
    val _pessoa = Pessoa()

    println(_pessoa)
    println(_pessoa.pessoaInfo())
}