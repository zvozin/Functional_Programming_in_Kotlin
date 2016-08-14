package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.filterThruFlatMap(f: (A) -> Boolean): List<A> = this.flatMap { if (f(it)) Cons(it, Nil) else Nil }