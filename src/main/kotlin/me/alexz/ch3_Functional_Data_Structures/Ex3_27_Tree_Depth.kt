package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> Tree<A>.depth(): Int = when(this){
    is Leaf -> 1
    else -> 1 + Math.max((this as Branch).left.depth(), this.right.depth())
}