package com.example.demokotlin

fun main(args: Array<String>) {
    println("enter number of prime number which you want to display from start")
    var n:Int= readLine()!!.toInt()



    var i:Int;
    i=2;
    while(n>0){
        if(isPrime(i)) {
            println(i)
            n--;
            i++
        }
        else{
            i++
        }
    }
}
fun isPrime(i:Int):Boolean{
    var count:Int;
    count=0;

    for(j in 1..i){
        if(i%j==0){
            count++
        }
    }
    if(count>2){
        return false
    }
    else{
        return true
    }
}