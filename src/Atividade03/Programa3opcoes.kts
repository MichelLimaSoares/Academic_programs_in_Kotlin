/*
46. Faça um programa na Linguagem Kotlin que leia tenha 3 opções:
1 - Fatorial
2 - Quadradro de um número
3 - Volume de uma lata
4 – Sair do Programa
Utilize os conceitos de funções em Kotlin
 */

fun main(){
    var opcao = 0;
    while (opcoes !=4){
        println("")
        println("Opções de Aplicativos")
        println("1 - Fatorial")
        println("2 - Quadrado de um numero")
        println("3 - Volume de uma Lata")
        println("4 - Sair")
        println("Escolha uma Opção digitando o numero:")
        println("")
        opcao = readLine()!!.toInt()

        when (opcao){
            1 -> fatorial()
            2 -> quadrado()
            3 -> volumeLata()
            4 -> sair()
        }
    }
}

fun fatorial(){
    println("Digite um numero")
    val num: Int = readLine().toString().toInt()

    var fat: Int = 1

    var (i in 1..num){
        fat *= i
    }
    println("Fatorial de $num é $fat")
}

fun quadrado(){
    val num: Int;
    val quadrado: Int;
    print("Digite um numero:")
    num = readLine(). toString(). toInt()
    quadrado = Math.pow(num.toDouble(), 2.0).toInt()
    println("O quadrado do numero $num é $quadrado")
}

fun volumeLata(){
    var raio: Double
    var altura: Double
    var volume: Double

    println("")
    println("Digite o raio da Circunferência")
    raio = readLine().toString().toDouble()
    println("")
    println("Digite a altura da lata")
    altura = readLine().toString().toDouble()
    volume = Math.PI*Math.pow(raio, 2.0) * altura
    println("")
    println("Volume da lata é $volume")

}

//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Programa que leia e execute 3 opções de programas