package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B> Stream<A>.map(f: (A) -> B): Stream<B> = foldRight(lazy { Empty }) {
    a, b: Lazy<Stream<B>> ->
    Cons(lazy { f(a) }, b)
}

fun <A> Stream<A>.filter(f: (A) -> Boolean): Stream<A> = foldRight(lazy {Empty}){
    a, b: Lazy<Stream<A>> ->
    if(f(a)) Cons(lazy{a}, b) else b.value
}

//  TODO: append and flatMap