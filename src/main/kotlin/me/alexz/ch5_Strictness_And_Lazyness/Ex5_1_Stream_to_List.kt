package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Nil
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

/**
 * Unlike in the book, we're converting to the List<A> we defined in Chapter 3.
 */
fun <A> Stream<A>.toList(): List<A> = when(this){
    is Empty -> Nil
    is Cons -> List.Cons(head.value, tail.value.toList())
}