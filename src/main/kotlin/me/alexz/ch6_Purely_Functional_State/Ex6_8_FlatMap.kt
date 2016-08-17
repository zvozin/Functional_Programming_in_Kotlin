package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun <A, B> flatMap(f: (RNG) -> Pair<A, RNG>,
                   g: (A) -> (RNG) -> Pair<B, RNG>): (RNG) -> Pair<B, RNG> = { rng ->
    val pair = f(rng)
    g(pair.first)(pair.second)
}

fun nonNegativeLongLessThan(n: Long): (RNG) -> Pair<Long, RNG> = { rng ->
    val (i, rng2) = nonNegativeLong(rng)
    val mod = i % n
    if (i + (n - 1) - mod >= 0) Pair(mod, rng2) else nonNegativeLongLessThan(n)(rng)
}