package org.kotlin.sample

class Main {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val persons = listOf(Person("John Doe", "London", "123"),
                    Person("Jane Doe", "London", "456"),
                    Person("Apple", "Tree", "789"))
            //TODO first last find
            //TODO filter
            //TODO reduce fold
            //TODO associate
            //TODO groupby
            //map, zip, etc.
        }
    }
}