package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil


/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.filter(f: (A) -> Boolean): List<A> = when (this) {
    is Cons ->
        if (f(head)) Cons(head, tail.filter(f))
        else tail.filter(f)
    is Nil -> Nil
}

fun List<Int>.removeOdds(): List<Int> = this.filter { it % 2 == 1 }