package me.alexz.ch2_Getting_Started

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B, C> Function2<A, B, C>.curry(): (A) -> (B) -> C = { a: A -> { b: B -> this.invoke(a, b) } }