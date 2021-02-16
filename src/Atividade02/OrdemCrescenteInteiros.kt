package Atividade02
/*
 Faça um programa na Linguagem Kotlin que leia 3 (três) valores inteiros e
apresente os 3 números em ordem crescente
 */
fun main (){

    for (n in ordenar(12, 33, 8)) {

        println ("$n")
    }
}
    fun ordenar( vararg numeros : Int ): IntArray{

        return numeros.sortedArray()
}
//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Ordenar tres valores em ordem crescente