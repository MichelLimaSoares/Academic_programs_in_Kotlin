/*
71.Faça um exemplo utilizando sortedBy
 */

fun main (){
    val alunos = arrayListOf ("João", "Maria",
        "Mario", "Pedro", "Marcos", "Andre")

    val alunosOrdenados = alunos.sortedBy {
        it.reversed ()}
        println (alunosOrdenados)

}
// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Exemplo utilizando sortedBy