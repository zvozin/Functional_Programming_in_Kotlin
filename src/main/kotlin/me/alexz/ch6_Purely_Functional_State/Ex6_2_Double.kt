package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun double(rng: RNG): Pair<Double, RNG> {
    val random = rng.nextLong()
    return Pair(random.first.toDouble() / Long.MAX_VALUE.toDouble(), random.second)
}