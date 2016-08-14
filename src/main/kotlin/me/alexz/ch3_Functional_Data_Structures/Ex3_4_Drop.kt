package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.drop(n: Int): List<A> {
    fun drop(n: Int, list: List<A>): List<A> = when (n) {
        0 -> list
        else -> when (this) {
            is Cons -> drop(n - 1, tail)
            else -> Nil
        }
    }

    return drop(n, this)
}