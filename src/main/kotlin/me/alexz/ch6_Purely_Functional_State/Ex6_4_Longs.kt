package me.alexz.ch6_Purely_Functional_State

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/16/16. Yes, indeed.
 */


fun longs(n: Int, rng: RNG): Pair<List<Long>, RNG> {
    fun pairs(n: Int, rng: RNG): List<Pair<Long, RNG>> = if (n == 0) Nil else {
        val nextLong = rng.nextLong()
        Cons(Pair(nextLong.first, nextLong.second), pairs(n - 1, nextLong.second))
    }

    return pairs(n, rng).foldRight(Pair<List<Long>, RNG>(Nil, rng)) { pi, po ->
        Pair(Cons(pi.first, po.first), pi.second)
    }
}