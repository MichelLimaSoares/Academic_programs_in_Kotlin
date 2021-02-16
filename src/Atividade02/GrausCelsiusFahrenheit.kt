package Atividade02
/*
 Faça um programa na Linguagem Kotlin que apresente os valores de
conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a
contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas.
 */
fun main(){
    var celsius: Int = 10
    for(celsius in 10..100 step 10){
        println("Celsius $celsius")
        var fahr: Int = (9 * celsius + 160) / 5
        println("Fahrenheit $fahr")
    }
}

//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Apresentar conversão de Celsius para Fahrenheit de 10 em 10 graus