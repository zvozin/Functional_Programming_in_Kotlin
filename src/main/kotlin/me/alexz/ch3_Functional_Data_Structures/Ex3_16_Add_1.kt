package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil


/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun List<Int>.addOne(): List<Int> = when(this){
    is Cons -> Cons(head + 1, tail.addOne())
    is Nil -> Nil
}