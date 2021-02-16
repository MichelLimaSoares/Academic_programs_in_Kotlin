package Atividade02
/*
7. O cardápio de uma lanchonete é o seguinte:
Especificação Código Preço
Cachorro quente 100 1,20
Bauru simples 101 1,30
Bauru com ovo 102 1,50
Hambúrger 103 1,20
Cheeseburguer 104 1,30
Refrigerante 105 1,00
Faça um programa na Linguagem Kotlin que leia o código do item pedido, a
quantidade e calcule o valor a ser pago por aquele lanche. Considere que a
cada execução somente será calculado um item.
 */

fun main() {
    val produtos = hashMapOf<Int, String>()
    produtos.put(100 , " Cachorro Quente R$ 1,20")
    produtos.put(101 , " Bauru Simples R$ 1,30")
    produtos.put(102 , " Bauru com Ovo R$ 1,50")
    produtos.put(103 , " Hamburger R$ 1,20")
    produtos.put(104 , " Cheeseburguer R$ 1,30")
    produtos.put(105 , " Refrigerante R$ 1,00")

    println("")
    print("Cardapio de Pedidos")
    println("")
    println("")
    for((Cod, Pedido) in produtos){
        println("$Cod - $Pedido")
    }
    println("")
    println("Pedido Selecionado")
    println("")
    //println(produtos.size)
    println(produtos.get(100))
    println(produtos[103])
    //println(produtos.contains(105))
    /*
    fun main (){
    println (calcular(5, 7, :: somar))
}
    fun somar(a: Int , b: Int ): Int{
    	return a + b
    }
    fun calcular(a: Int , b: Int , funcao : Int , Int ) --> Int ): Int{
    	return funcao (a,b)
    }
}
     */
}






//Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: