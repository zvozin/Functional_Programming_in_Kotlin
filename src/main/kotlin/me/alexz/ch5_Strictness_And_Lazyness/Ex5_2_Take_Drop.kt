package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A> Stream<A>.take(n: Int): Stream<A> = if (n == 0) Empty else when (this) {
    is Empty -> Empty
    is Cons -> Cons(head, lazy { tail.value.take(n - 1) })
}

fun <A> Stream<A>.drop(n: Int): Stream<A> = if (n == 0) this else when (this) {
    is Empty -> Empty
    is Cons -> Cons(head, lazy { tail.value.drop(n - 1) })
}