package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.Tree.Branch
import me.alexz.ch3_Functional_Data_Structures.Tree.Leaf

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> Tree<A>.depth(): Int = when(this){
    is Branch -> 1 + Math.max(left.depth(), right.depth())
    is Leaf -> 1
}