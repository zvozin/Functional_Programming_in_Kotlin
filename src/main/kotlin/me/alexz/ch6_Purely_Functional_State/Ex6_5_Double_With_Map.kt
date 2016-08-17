package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun doubleM(rng: RNG) = map({ it.nextLong() }) { it.toDouble() / Long.MAX_VALUE.toDouble() }