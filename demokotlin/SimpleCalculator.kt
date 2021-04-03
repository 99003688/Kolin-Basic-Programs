package com.example.demokotlin

fun main(args : Array<String>){
    println("Enter the first number")
    val number1 =  readLine()!!.toInt()
    println("Enter the second number")
    val number2 =  readLine()!!.toInt()


    val text1 ="""
        Choose any one to do the operation
            1. Addition
            2. Substraction
            3.division
            4. multiplication
           
    """
    println(text1)
    val text: Int = readLine()!!.toInt()
    if (text == 1){
        val c= number1 + number2
        println("the addition is $c")
    }

    if (text == 2){
        val c= number1 - number2
        println("the addition is $c")
    }

    if (text == 3){
        val c= number1 / number2
        println("the addition is $c")
    }

    if (text == 4){
        val c= number1 * number2
        println("the addition is $c")
    }
}