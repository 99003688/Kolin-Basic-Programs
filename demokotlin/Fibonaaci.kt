package com.example.demokotlin

fun main( args : Array<String>){

    println("Enter the number to be printed to")
    val number1 =  readLine()!!.toInt()
    var a= 0
    var b= 2
    println(" enter the first $number1 terms:")

    for(i in 1 ..number1){
        println("$a")
        val sum= a+b
        a=b
        b=sum
    }


}