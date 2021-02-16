package Atividade02
/*
 Faça um programa na Linguagem Kotlin que leia quatros valores referentes
a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o
aluno não foi aprovado, indicar uma mensagem informando esta condição.
Apresentar junto das mensagens o valor da média do aluno para qualquer
condição.
 */

fun main(){

    var nota1: Int = 7
    var nota2: Int = 7
    var nota3: Int = 5
    var nota4: Int = 7

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 7){
        println("Aprovado")
    }
    else if (media < 7){
        println("Reprovado")
    }
    println("A media do aluno foi: $media")

}
//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Calcular e mostrar media, indicando se foi aprovado ou não.