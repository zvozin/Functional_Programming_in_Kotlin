package me.alexz.ch2_Getting_Started

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B, C> Function1<A, Function1<B, C>>.uncarry(): (A, B) -> C = { a: A, b: B -> this.invoke(a).invoke(b) }
