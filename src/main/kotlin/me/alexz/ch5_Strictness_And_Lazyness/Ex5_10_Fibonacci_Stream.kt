package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun fibonacci(): Stream<Int> {
    fun fibonacci(prev: Int, current: Int): Stream<Int> =
            Cons(lazy { current }, lazy { fibonacci(current, prev + current) })
    return fibonacci(0, 1)
}