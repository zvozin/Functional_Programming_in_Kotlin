package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.Tree.Branch
import me.alexz.ch3_Functional_Data_Structures.Tree.Leaf

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A, B> Tree<A>.map(f: (A) -> B): Tree<B> = when(this){
    is Branch -> Branch(left.map(f), right.map(f))
    is Leaf -> Leaf(f(value))
}