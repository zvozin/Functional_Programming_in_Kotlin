package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

tailrec fun <A, B> List<A>.foldLeft(seed: B, f: (A, B) -> B): B = when (this) {
    is Cons -> this.tail.foldLeft(f(head, seed), f)
    is Nil -> seed
}