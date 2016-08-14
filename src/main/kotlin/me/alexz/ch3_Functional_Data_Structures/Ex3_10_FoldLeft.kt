package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

tailrec fun <A, B> List<A>.foldLeft(seed: B, f: (A, B) -> B): B = when (this) {
    is Nil -> seed
    else -> (this as Cons).tail.foldLeft(f(head, seed), f)
}