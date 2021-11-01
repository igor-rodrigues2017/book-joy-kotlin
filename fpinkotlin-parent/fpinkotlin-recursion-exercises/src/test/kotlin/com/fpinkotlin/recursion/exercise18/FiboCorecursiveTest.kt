package com.fpinkotlin.recursion.exercise18

import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec


class FiboCorecursiveTest : StringSpec() {

    init {
        val mapOf: Map<String, Any> = hashMapOf("var" to "Igor")
        "fibonacci" {
            forAll(100, Gen.choose(3, 300)) { n ->
                fiboCorecursive(n - 1) == fiboCorecursive(n).substringBeforeLast(",")
            }
        }
    }
}