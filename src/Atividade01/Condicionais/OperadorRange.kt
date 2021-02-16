package Atividade01.Condicionais
//Encadeado
fun main(){
    val nota: Double = 9.8

    if(nota in 9..10){
        println("Nota Execelente")
    }
    else if (nota in 6..8){
        println("Aprovado")
    }
    else if(nota in 0..5){
        println("Reprovado")
    }
    else{
        println("Nota invalida")
    }



}