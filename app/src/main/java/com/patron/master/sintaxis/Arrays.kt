package com.patron.master.sintaxis

fun main(){


    val arrayNames = arrayOf("Alfonso", "Juan", "Carlos","Jorge","Luis")


    for (position in arrayNames.indices){
        print("El nombre en la posición $position seleccionado es : ")
        println(arrayNames[position])
    }

    println("------------------")

    for((position, value) in arrayNames.withIndex()){
        println("El nombre en la posición $position seleccionado es : $value")
    }
}