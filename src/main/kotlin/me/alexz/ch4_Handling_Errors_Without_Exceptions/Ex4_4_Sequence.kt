package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil
import me.alexz.ch3_Functional_Data_Structures.foldLeft
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A> List<Option<A>>.sequence(): Option<List<A>> = foldLeft(Some(Nil)) { oa, l: Option<List<A>> ->
    l.flatMap { l -> oa.map { Cons(it, l) } }
}
