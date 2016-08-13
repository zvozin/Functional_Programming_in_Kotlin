package me.alexz.ch2_Getting_Started

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

infix fun <A, B, C> Function1<A, B>.compose(g: Function1<B, C>): (A) -> C = { a: A -> g(this.invoke(a)) }