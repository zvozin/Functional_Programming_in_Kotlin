package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

/**
 * The list ADT
 */
sealed class List<out A>{

    object Nil : List<Nothing>()
    class Cons<out A>(val head: A, val tail: List<A>) : List<A>()

    fun <B> foldRight(seed: B, f: (A, B) -> B): B = when (this) {
        is Cons -> f(head, tail.foldRight(seed, f))
        else -> seed
    }

    fun <B> equals(other: List<B>): Boolean = when(this){
        is Cons -> (other as Cons).head!!.equals(head) && other.tail.equals(tail)
        else -> true
    }
}

fun <A> list(vararg aas: A): List<A> = aas.asList().foldRight(List.Nil){ a, r: List<A> -> List.Cons(a, r)}

/**
 * The tree ADT
 */
sealed class Tree<out A>{
    class Leaf<out A>(val value: A): Tree<A>()
    class Branch<out A>(val left: Tree<A>, val right: Tree<A>): Tree<A>()
}
