package com.example.demokotlin

import java.util.*
import kotlin.collections.ArrayList

fun Palin(n: Long): Boolean {
    var PalinNumber = false
    var summ : Long= 0
    var tempt = n

    while (tempt > 0) {
        val r = tempt % 10
        summ = summ * 10 + r
        tempt /= 10
    }
    if (summ == n) {
        PalinNumber = true
    }
    return PalinNumber
}


fun main(arg: Array<String>) {

    val sc = Scanner(System.`in`)
    println("Enter the number till you want palindrome")
    val number1: Long = sc.nextLong()

    val list: MutableList<Long> = ArrayList()

    for (i in 0..number1) {
        if (Palin(i)) {
            list.add(i)
        }
    }

    println("Palindrome Numbers from 0 to $number1  are : $list")
}
