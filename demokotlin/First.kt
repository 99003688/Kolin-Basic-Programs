package com.example.demokotlin

import android.icu.text.StringSearch

fun main(args: Array<String>){
/*

    var i : String= "saujanya"
    val text1 ="""
             Welcome
                 To
           JavaTpoint
    """
    val a : Int=123

    println("Hello world "+i +a)
    println(text1)
    var arr= arrayOf(1,4,5,656,5,"saujanya")
    for(i in 1 ..10 ){
        println(i)
    }



     val marks = Array<Int>(5){0}
    var x:Int = 0
    var abc:Int = marks.size


    val first = 1.5f
    val second = 2.0f
     val mul = first* second
     println("the product is : $mul")

    for (i in 0..4){
        marks[i]= readLine()!!.toInt().toInt()
        println(marks[i])
    }


*/

    val arraylist = ArrayList<String>()

    arraylist.add("saujanya")
    arraylist.add("vaibhav")
    arraylist.add("asfguissdk")
    arraylist.add("sfgyisd")

    for(i in arraylist){
        println(i)
    }
    arraylist.removeAt(0)
    for(i in arraylist){
        println(i)
    }


}





