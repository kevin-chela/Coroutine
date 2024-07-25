//Scope builder and concurrency

package org.example
import kotlinx.coroutines.*

//sampleStart

// Sequentially executes doWorld followed by "Done"
fun main() = runBlocking {
    doWorld2()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld2() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}
//sampleEnd
