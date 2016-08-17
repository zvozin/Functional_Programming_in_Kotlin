package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun from(n: Int): Stream<Int> = Cons(lazy { n }, lazy { from(n + 1) })