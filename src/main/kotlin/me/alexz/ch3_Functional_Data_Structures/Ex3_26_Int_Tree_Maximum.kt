package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun Tree<Int>.max(): Int = when(this){
    is Leaf -> this.value
    else -> Math.max((this as Branch).left.max(), this.right.max())
}