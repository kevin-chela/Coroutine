//Scope Builder

package org.example

import kotlinx.coroutines.*
//sampleStart

fun main() = runBlocking {
    doWorld1()
}

suspend fun doWorld1() = coroutineScope { // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}
//sampleEnd
