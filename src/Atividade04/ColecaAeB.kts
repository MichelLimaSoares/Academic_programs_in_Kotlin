/*
51. Criar uma coleção “A” na linguagem Kotlin com 10
elementos
– Inserir os elementos de 1 a 10 na coleção
– Criar uma outra coleção B que conterá o elemento da
  coleção A multiplicado por 2
– Mostrar as duas coleções
 */

fun main (){
    val colecaoA = Array <Int>( 11, {i -> i})
    for (i in 1..10)
    {
        println ("Coleção A = " + colecaoA [i])
    }

    println("")
    val colecaoB = Array <Int>( 11, {i -> i})
    for (j in 1..10)
    {
        println ("Coleção B = " + colecaoB [j] * 2)
    }
}

// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Mostrar duas coleções: A e B, sendo B multiplicada por 2