/*
70. Faça um exemplo uma variável do tipo função
anônima (slide 5)
 */

fun main (){
    println ("${minimo (10, 15)}")
}
fun minimo (a: Int , b: Int ): Int {
    return if (a < b) a else b
}

// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Função anonima