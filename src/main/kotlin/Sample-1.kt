//basic  coroutine concept
//Coroutine definition a function suspends its execution at some point & resume on later

package org.example

import kotlinx.coroutines.*

//sampleStart
fun main() = runBlocking { // this: CoroutineScope
    repeat(50_000) { // launch a lot of coroutines
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World!") // print after delay
        }
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}
//sampleEnd
