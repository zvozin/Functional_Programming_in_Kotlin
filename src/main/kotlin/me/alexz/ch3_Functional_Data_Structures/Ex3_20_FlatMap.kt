package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B> List<A>.flatMap(f: (A) -> List<B>): List<B> =
        this.map(f).foldRight(Nil) { acc, add: List<B> -> acc.append(add) }