package com.fpinkotlin.recursion.exercise03

import java.math.BigInteger
import java.math.BigInteger.ONE
import java.math.BigInteger.ZERO


fun fib(x: Int): BigInteger {
    tailrec fun fib(acc1: BigInteger, acc2: BigInteger, position: BigInteger): BigInteger =
        when {
            position == ZERO -> ONE
            position == ONE -> acc1 + acc2
            else -> fib(acc2, acc1 + acc2, position - ONE)
    }
    return fib(ZERO, ONE, x.toBigInteger())
}
