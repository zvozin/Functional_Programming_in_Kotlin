package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B> List<A>.map(f: (A) -> B): List<B> = when(this){
    is Cons -> Cons(f(head), tail.map(f))
    else -> Nil
}