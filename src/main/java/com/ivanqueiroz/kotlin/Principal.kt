package com.ivanqueiroz.kotlin

import com.ivanqueiroz.kotlin.dto.Usuario

/*

  @author Ivan Queiroz <ivanqueiroz@gmail.com>
  Created on 15/01/2017
*/

fun main(args: Array<String>) {
    val usuario = Usuario("João", 35)
    val usuario2 = Usuario("Maria", 35)

    println("Nome: ${usuario.nome}")
    println("Idade: ${usuario.idade}")
    println(usuario.toString())
    println("Hashcode: ${usuario.hashCode()}")

    println("Nome: ${usuario2.nome}")
    println("Idade: ${usuario2.idade}")
    println(usuario2.toString())
    println("Hashcode: ${usuario2.hashCode()}")

    println("usuario.equals(usuario2) = ${usuario.equals(usuario2)}")

    val usuario3: Usuario? = Usuario("Pedro", 30)
    if (usuario3 != null) {
        println(usuario3.nome)
    }
}

