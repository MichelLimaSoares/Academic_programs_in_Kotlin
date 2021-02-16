/*
72. Faça um exemplo utilizando filter
 */

data class Aluno( val nome: String , val nota: Double)
fun main () {
    val alunos = arrayListOf(

            Aluno("João", 5.0),
            Aluno("Maria", 10.0),
            Aluno("Mario", 8.1),
            Aluno("Pedro", 6.5),
            Aluno("Marcos", 7.0),
            Aluno(" Andre ", 5.6)
    )

    val alunosAprovados = alunos.filter { it.nota >= 7.0 }
    println(alunosAprovados)

}

// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Exemplo utilizando Filter