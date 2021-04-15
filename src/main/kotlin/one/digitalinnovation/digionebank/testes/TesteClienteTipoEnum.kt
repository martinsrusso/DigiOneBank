package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { e ->
        println("> ${e.name} - ${e.toString()}")
    }

    ClienteTipo.values().forEach {
        println(">> ${it.name} - $it")
    }

    ClienteTipo.values().forEach {
        println(">>> ${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">>>> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>>> ${pj.name} - ${pj.descricao}")
}