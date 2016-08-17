package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.None
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */
 fun <A> Stream<A>.tails(): Stream<Stream<A>> = unfold(this){ s: Stream<A> ->
    when(s){
        is Empty -> None
        is Cons -> Some(Pair(s, s.tail.value))
    }
}