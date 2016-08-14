package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.init(): List<A> = when (this) {
    is Cons -> when (tail) {
        is Nil -> Nil
        else -> Cons(head, tail.init())
    }
    else -> Nil
}