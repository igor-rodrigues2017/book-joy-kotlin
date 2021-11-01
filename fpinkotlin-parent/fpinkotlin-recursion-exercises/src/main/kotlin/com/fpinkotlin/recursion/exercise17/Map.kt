package com.fpinkotlin.recursion.exercise17


fun <T> List<T>.head(): T =
    if (this.isEmpty())
        throw IllegalArgumentException("head called on empty list")
    else
        this[0]

fun <T> List<T>.tail(): List<T> =
    if (this.isEmpty())
        throw IllegalArgumentException("tail called on empty list")
    else
        this.subList(1, this.size)

fun <T, U> foldLeft(list: List<T>, z: U, f: (U, T) -> U): U {
    tailrec fun foldLeft_(list: List<T>, acc: U, f: (U, T) -> U): U =
        if (list.isEmpty())
            acc
        else
            foldLeft_(list.tail(), f(acc, list.head()), f)
    return foldLeft_(list, z, f)
}

fun <T, U> map(list: List<T>, f: (T) -> U): List<U> {
    tailrec fun map_(acc: List<U>, elements: List<T>): List<U> =
        if(elements.isEmpty()) acc else map_(acc + f(elements.head()), elements.tail())
    return map_(listOf(), list)
}


//or

fun <T, U> map2(list: List<T>, f: (T) -> U): List<U> = foldLeft(list, listOf()) { acc, element -> acc + f(element) }
