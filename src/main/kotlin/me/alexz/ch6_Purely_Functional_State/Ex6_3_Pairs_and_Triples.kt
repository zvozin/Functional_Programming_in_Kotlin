package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */

fun longDouble(rng: RNG): Pair<Pair<Long, Double>, RNG> {
    val long = nonNegativeLong(rng)
    val double = double(long.second)
    return Pair(Pair(long.first, double.first), double.second)
}


fun doubleLong(rng: RNG): Pair<Pair<Double, Long>, RNG> {
    val double = double(rng)
    val long = nonNegativeLong(double.second)
    return Pair(Pair(double.first, long.first), long.second)
}


fun tripleDouble(rng: RNG): Pair<Triple<Double, Double, Double>, RNG> {
    val double1 = double(rng)
    val double2 = double(double1.second)
    val double3 = double(double2.second)
    return Pair(Triple(double1.first, double2.first, double3.first), double3.second)
}