package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.reverse(): List<A> = this.foldLeft(Nil) { a: A, l: List<A> -> Cons(a, l) }