package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B, C> List<A>.zipWith(other: List<B>, f: (A, B) -> C): List<C> = when (this) {
    is Cons -> Cons(f(head, (other as Cons).head), tail.zipWith(other.tail, f))
    is Nil -> Nil
}