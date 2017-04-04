package org.kotlin.sample

import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.produce
import kotlin.coroutines.experimental.CoroutineContext

class Main {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            (1..10000).forEach {
                launch(CommonPool) {
                    delay(1000)
                    println("test")
                    async(CommonPool) {

                    }.await()
                }
            }

            produce(CommonPool) {
                send(1)
            }
            runBlocking {
                Job
                println("Thread 1 id = ${Thread.currentThread().id}")
                val job = launch(CommonPool) {
                    (1..10).forEach {
                        println("Thread 2 id = ${Thread.currentThread().id}")
                        println(it)
                        delay(100)
                    }
                }
                withTimeout(500) {

                }
                println("Thread 4 id = ${Thread.currentThread().id}")
                (10..20).forEach {
                    println(it)
                    delay(100)
                }
                job.join()
                println("Thread 5 id = ${Thread.currentThread().id}")
            }
        }
    }
}

