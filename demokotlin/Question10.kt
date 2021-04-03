package com.example.demokotlin

fun main()
{
    println("Enter the year")
    var y= readLine()!!.toInt()

    if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
    {
        println("This is a leap year")
    }
    else
    {
        print("this is not a leap year")
    }
}
