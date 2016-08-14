package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.Tree.Branch
import me.alexz.ch3_Functional_Data_Structures.Tree.Leaf

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> Tree<A>.size(): Int = when(this){
    is Branch -> 1 + left.size() + right.size()
    is Leaf -> 1
}