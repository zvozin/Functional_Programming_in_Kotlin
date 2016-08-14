package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun List<Int>.addListwise(other: List<Int>): List<Int> = when(this){
    is Cons -> Cons(head + (other as Cons).head, tail.addListwise(other.tail))
    else -> Nil
}