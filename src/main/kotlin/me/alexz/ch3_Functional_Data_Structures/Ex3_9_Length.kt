package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> List<A>.length(): Int = this.foldRight(0) { a: A, i: Int -> i + 1 }