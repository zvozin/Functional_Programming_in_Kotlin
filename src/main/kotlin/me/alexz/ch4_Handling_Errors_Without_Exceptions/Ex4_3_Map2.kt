package me.alexz.ch4_Handling_Errors_Without_Exceptions

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B, C> Option<A>.map2(b: Option<B>, f: (A, B) -> C): Option<C> =
        flatMap { av -> b.map { bv -> f(av, bv) } }
