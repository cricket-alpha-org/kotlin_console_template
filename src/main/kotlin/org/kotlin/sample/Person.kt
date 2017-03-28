package org.kotlin.sample

data class Person(val name: String, val address: String, val phoneNumber: String) {
    fun filterer(item: String) = item.startsWith("a")
}