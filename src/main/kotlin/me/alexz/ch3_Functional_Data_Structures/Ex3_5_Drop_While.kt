package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.dropWhile(f: (A) -> Boolean): List<A> = when (this) {
    is Cons -> when {
        f(head) -> Cons(head, tail.dropWhile(f))
        else -> tail.dropWhile(f)
    }
    is Nil -> Nil
}