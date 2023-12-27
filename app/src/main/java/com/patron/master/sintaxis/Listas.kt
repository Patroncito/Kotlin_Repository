package com.patron.master.sintaxis

fun main(){
    // inmutableList()
    mutableList()
}


fun inmutableList(){


    val readOnly:List<String> = listOf("Alfonso", "Juan", "Carlos","Jorge","Luis")

    println(readOnly.first())


    val example = readOnly.filter { it.contains("n") }
    println(example)


    readOnly.forEach{weekDay -> println(weekDay)}
}

fun mutableList(){

    val namesList:MutableList<String> = mutableListOf("Alfonso", "Juan", "Carlos","Jorge","Luis")
    namesList.add(4, "Francisco")
    println(namesList)



}