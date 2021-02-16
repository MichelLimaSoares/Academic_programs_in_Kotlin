/*
54. Fazer um procedimento para receber as notas da primeira e da segunda
prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em
vetores distintos. Calcular e escrever a média de cada aluno.
 */
fun main () {

    val alunos = hashMapOf<String, Double>()

    alunos.put("michel", 7.00)
    alunos.put("Augusto", 9.00)
    alunos.put("Lucas", 4.00)
    alunos.put("Leticia", 6.00)
    alunos.put("Fernada", 5.00)

    for ((nome, nota1) in alunos) {
        println("$nome > $nota1")
    }
    println("")
    for((nome, nota2) in alunos) {
        println("$nome > $nota2")
    }

}
    /*val alunos = arrayListOf ("João" , "Maria", "Marcio",
            "Felipe", "Angela")
    val nota1 = arrayListOf (10,6, 5, 9, 7)

    val notas1 = alunos + nota1
    for (i in notas1){
        print("$notas1")
    }
    println("")
    val nota2 = arrayListOf (5,7, 4, 9, 8)

    val notas2 = alunos + nota2
    for (i in notas2) {
        print("$notas2")
    }
}*/


// Nome: Michel de Lima Soares
//Ra: 2920481911045
//Objetivo: 1° e 2° nota, de 5 alunos