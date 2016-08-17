package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun nonNegativeLong(rng: RNG): Pair<Long, RNG> {
    var pair: Pair<Long, RNG>;
    do {
        pair = rng.nextLong()
    } while (pair.first == Long.MIN_VALUE)
    return Pair(-1L * pair.first, pair.second)
}