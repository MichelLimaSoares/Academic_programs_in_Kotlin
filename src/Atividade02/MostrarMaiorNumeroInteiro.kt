package Atividade02
/*
 Faça um programa na Linguagem Kotlin que leia 3 números inteiros e
mostre o maior deles.
 */
fun main() {
    var num1: Int = 10000
    var num2: Int = 1200
    var num3: Int = 150

    if (num1 > num2 && num1 > num3){
        println(num1)
    }
    if (num2 > num1 && num2 > num3 ){
        println(num2)
    }
    else if (num3 > num2 && num3 > num1){
        println(num3)
    }

}
//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Mostrar maior numero inteiro