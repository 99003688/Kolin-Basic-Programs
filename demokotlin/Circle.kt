package com.example.demokotlin

fun main(args : Array<String>){

    println("Enter the radius of the circle")
    val number : Float = readLine()!!.toFloat()
    val sq: Float= number*number
    var area : Float = (3.14 *sq).toFloat()
    var perimeter =(3.14 *number)*2
    var length= perimeter/4

    val text="""
        
        The Area of the circle = $area
        The length of the square = $perimeter
        
    """.trimIndent()
    println(text)
}