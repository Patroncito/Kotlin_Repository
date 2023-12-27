package com.patron.master.sintaxis

fun main(){
    getMoth(13)
    getTrismester(6)
    println(getSemester(1))
}


fun getMoth(month : Int){
    when(month){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("Agust")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("This Month Dont Exist")


    }
}

fun getTrismester(month: Int) {
    when (month) {
        1,2,3 -> println("First Trimester")
        4,5,6 -> println("Second Trimester")
        7,8,9 -> print("Third Trimester")
        10,11,12 -> println("Fourth Trimester")
        else -> print("Dont Exist  trimester")
    }
}

fun getSemester(month: Int):String {
return when(month){
    in 1..6 -> "First Semester"
    in 7..12-> "Second Semester"
    else -> "Invalid Semester"
}

}