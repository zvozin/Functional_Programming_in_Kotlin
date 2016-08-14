package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B> Tree<A>.map(f: (A) -> B): Tree<B> = when(this){
    is Leaf -> Leaf(f(value))
    else -> Branch((this as Branch).left.map(f), this.right.map(f))
}