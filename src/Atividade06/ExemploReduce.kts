/*
73. Faça um exemplo utilizando reduce
 */

data class Produto ( val nome: String, val preco : Double)

fun main (){
    val materialEscolar = listOf(
            Produto("Caderno", 21.90),

            Produto("Lápis de Cor", 11.90),

            Produto("Borracha Bicolor", 0.70),

            Produto("Apontador", 1.80)
    )

    val totalizar = {total: Double, atual: Double -> total + atual}

    val precoTotal = materialEscolar.map {it.preco}.reduce(totalizar)

    println ("O total é R$ $precoTotal")

}

// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: Exemplo utilizando o reduce