package me.alexz.ch6_Purely_Functional_State

/**
 * Created by azuzin37 on 8/17/16. Yes, indeed.
 */


fun <A, B> mapF(a: (RNG) -> Pair<A, RNG>, f: (A) -> B): (RNG) -> Pair<B, RNG> = flatMap(a) { a ->
    { rng: RNG ->
        Pair(f(a), rng)
    }
}

fun <A, B, C> map2F(a: (RNG) -> Pair<A, RNG>,
                    b: (RNG) -> Pair<B, RNG>,
                    f: (A, B) -> C): (RNG) -> Pair<C, RNG> = flatMap(a) { a ->
    { rng: RNG ->
        val pair: Pair<B, RNG> = b.invoke(rng)
        Pair(f(a, pair.first), pair.second)
    }
}