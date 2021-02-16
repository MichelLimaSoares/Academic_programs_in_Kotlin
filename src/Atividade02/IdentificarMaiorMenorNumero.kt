package Atividade02
/*
 Faça um programa na Linguagem Kotlin que efetue a leitura de cinco
números inteiros e identificar o maior e o menor valor. Não execute a
ordenação de valores.
 */
fun main(){
    var n1 = 40000
    var n2 = 5000
    var n3 = 600
    var n4 = 80
    var n5 = 9

    if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
        println("$n1 é o maior")
    if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5)
        println("$n2 é o maior")
    if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5)
        println("$n3 é o maior")
    if(n4 > n1 && n4 > n3 && n4 > n2 && n4 > n5)
        println("$n4 é o maior")
    else if(n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4)
        println("$n5 é o maior")

    if(n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
        println("$n1 é o menor")
    if(n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
        println("$n2 é o menor")
    if(n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5)
        println("$n3 é o menor")
    if(n4 < n1 && n4 < n3 && n4 < n2 && n4 < n5)
        println("$n4 é o menor")
    else if(n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4)
        println("$n5 é o menor")

}

//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Identificar menor e maior numero entre 5 numeros inteiros