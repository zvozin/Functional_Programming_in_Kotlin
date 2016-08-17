package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

data class RNG(val seed: Long) {

    fun nextLong(): Pair<Long, RNG> {
        val newSeed = (seed * 0x5DEECE66DL) and 0xFFFFFFFFFFFFL
        val nextRNG = RNG(newSeed)
        val n = newSeed shr 16
        return Pair(n, nextRNG)
    }
}

fun <A, B> map(s: (RNG) -> Pair<A, RNG>, f: (A) -> B): (RNG) -> Pair<B, RNG> = { rng ->
    val (a, rng2) = s(rng)
    Pair(f(a), rng2)
}