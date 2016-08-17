package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A> Stream<A>.takeWith(f: (A) -> Boolean): Stream<A> = when (this) {
    is Empty -> Empty
    is Cons ->
        if (f(head.value)) Cons(head, lazy { tail.value.takeWith(f) })
        else tail.value
}