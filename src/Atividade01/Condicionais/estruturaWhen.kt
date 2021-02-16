package Atividade01.Condicionais

fun main(){
    val nota: Double = 2.5
    when(nota){
        10.0, 9.8 -> println("Nota Excelente")
        6.0, 7.0, 8.0 -> println("Aprovado")
        4.0, 5.0 -> println("Reprovado")
        in 0..3 -> println("Reprovado")
        else -> println('Nota Invalida')


    }


}