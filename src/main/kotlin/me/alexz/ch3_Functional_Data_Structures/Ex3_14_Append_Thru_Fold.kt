package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.append(other: List<A>) = other.foldLeft(this){a, ls -> Cons(a, ls)}