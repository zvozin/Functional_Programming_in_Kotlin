package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A> Stream<A>.takeWhileByFold(f: (A) -> Boolean): Stream<A> = foldRight(lazy{Empty}){
    a, lb: Lazy<Stream<A>> ->
    if(f(a)) Cons(lazy{a}, lb)
    else lb.value
}