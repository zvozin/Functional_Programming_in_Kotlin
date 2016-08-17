package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

tailrec fun <A> Stream<A>.forAll(f: (A) -> Boolean): Boolean = when(this){
    is Empty -> true
    is Cons ->
        if(!f(head.value)) false
        else tail.value.forAll(f)
}