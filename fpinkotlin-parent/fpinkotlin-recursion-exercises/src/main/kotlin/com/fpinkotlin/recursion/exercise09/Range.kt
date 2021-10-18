package com.fpinkotlin.recursion.exercise09


fun range(start: Int, end: Int): List<Int> {
    val list = mutableListOf<Int>()
    var index = start
    while (index <  end) {
        list.add(index)
        index++
    }
    return list
}