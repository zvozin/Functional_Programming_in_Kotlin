package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil
import me.alexz.ch3_Functional_Data_Structures.foldLeft
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B> List<A>.traverseOpt(f: (A) -> Option<B>): Option<List<B>> = foldLeft(Some(Nil)) {
    a, olb: Option<List<B>> ->
    olb.flatMap { l -> f(a).map { Cons(it, l) } }
}

fun <A> List<A>.sequenceOpt(): Option<List<A>> = traverseOpt { Some(it) }