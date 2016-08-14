package me.alexz.ch3_Functional_Data_Structures

import java.util.*

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

/**
 * head() and tail() helpers for Array
 * NOTE: this is a ridiculously inefficient, non-persistent way of tailing an array.
 * It's meant for the purposes of this exercise only. Do NOT imitate.
 */
fun <A> Array<A>.head(): A? = when (this.size) {
    0 -> null
    else -> this[0]
}

fun <A> Array<A>.tail(): Array<A> = when (this.size) {
    0, 1 -> Arrays.copyOf(this, 0)
    else -> Arrays.copyOf(this, 1)
}


/**
 * The list ADT
 */
interface List<out A>{
    fun <B> foldRight(seed: B, f: (A, B) -> B): B = when (this) {
        is Cons -> f(head, tail.foldRight(seed, f))
        else -> seed
    }
}
object Nil : List<Nothing>
data class Cons<out A>(val head: A, val tail: List<A>) : List<A>


/**
 * The tree ADT
 */
interface Tree<out A>
data class Leaf<out A>(val value: A): Tree<A>
data class Branch<out A>(val left: Tree<A>, val right: Tree<A>): Tree<A>
