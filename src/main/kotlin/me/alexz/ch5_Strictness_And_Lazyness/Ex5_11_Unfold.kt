package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option
import me.alexz.ch4_Handling_Errors_Without_Exceptions.getOrElse
import me.alexz.ch4_Handling_Errors_Without_Exceptions.map
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, S> unfold(z: S, f: (S) -> Option<Pair<A, S>>): Stream<A> = f(z).
        map { pas -> Cons(lazy { pas.first }, lazy { unfold(pas.second, f) }) }.
        getOrElse(lazy { Empty })