/*
49. Criar uma coleção na linguagem Kotlin com 10 elementos
– Inserir os elementos de 1 a 10 no vetor
– Após a inserção, somente após a inserção mostrar o vetor.
Obs. Não efetuar a leitura de 10 elementos
 */
fun main () {
    val numeros = Array<Int>(11, { i -> i })
    for (i in 1..10) {
        println(numeros[i])
    }
}

// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Vetor com elementos de 1 a 10