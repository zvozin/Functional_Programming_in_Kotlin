package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun <A, B, C> map2(ra: (RNG) -> Pair<A, RNG>,
                   rb: (RNG) -> Pair<B, RNG>,
                   f: (A, B) -> C): (RNG) -> Pair<C, RNG> = { rng ->
    val pairA = ra(rng)
    val pairB = rb(pairA.second)
    Pair(f(pairA.first, pairB.first), pairB.second)
}

