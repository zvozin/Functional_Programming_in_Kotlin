package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun fibonacciU(): Stream<Int> = unfold(Pair(0, 1)) {
    Some(Pair(it.first + it.second, Pair(it.second, it.first + it.second)))
}

fun fromU(n: Int): Stream<Int> = unfold(n) { Some(Pair(it, it + 1)) }

fun <A> constantU(a: A): Stream<A> = unfold(a) { Some(Pair(it, it)) }

fun ones(): Stream<Int> = constantU(1)