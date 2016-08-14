package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun List<Double>.asStrings(): List<String> = when(this){
    is Cons -> Cons(head.toString(), tail.asStrings())
    else -> Nil
}