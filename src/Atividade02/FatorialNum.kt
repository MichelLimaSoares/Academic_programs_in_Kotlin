package Atividade02
/*
 Faça um programa na Linguagem Kotlin que que receba um número e
mostre o fatorial desse número.
 */
fun main(){
    val num = 10
    var i = 1
    var fatorial: Long = 1
    while(i <= num){
        fatorial *= i.toLong()
        i++
    }
    println(" O fatorial de $num é = $fatorial")
}

//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Mostrar o fatorial de um numero