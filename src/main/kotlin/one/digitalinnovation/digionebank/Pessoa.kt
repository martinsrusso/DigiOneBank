package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Leo"
    var cpf: String = "111.111.111-11"

    inner class Endereco
    {
        var rua: String = "Rua 1"
    }
}

fun main() {
    val _pessoa = Pessoa()
    println(_pessoa.nome)
    println(_pessoa.cpf)
    println(_pessoa.Endereco().rua)
}