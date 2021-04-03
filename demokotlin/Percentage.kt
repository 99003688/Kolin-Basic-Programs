package com.example.demokotlin

fun main(args : Array<String>) {
    println("Enter the English marks")
    val number1 : Float= readLine()!!.toFloat()
    println("Enter the Maths marks")
    val number2 : Float= readLine()!!.toFloat()
    println("Enter the Science marks")
    val number3 : Float=  readLine()!!.toFloat()
     var t: Float = number1+number2+number3
     var p : Float = t/3


    val text ="""
        RESULT
        Subject       Marks
       1. English =  $number1
       2. Maths   =  $number2
       3. Science =  $number3
       
       total =      $t
       percentage = $p
        
    """.trimIndent()

 println(text)


    }
