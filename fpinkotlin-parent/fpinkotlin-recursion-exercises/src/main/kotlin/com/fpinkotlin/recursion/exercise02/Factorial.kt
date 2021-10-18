package com.fpinkotlin.recursion.exercise02

object Factorial {
    val factorial: (Int) -> Int by lazy { { x: Int -> if (x <= 1) x else x * factorial(x - 1)} }
}