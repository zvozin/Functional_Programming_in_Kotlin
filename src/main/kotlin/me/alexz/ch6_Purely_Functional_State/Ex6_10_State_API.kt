package me.alexz.ch6_Purely_Functional_State

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil

/**
 * Created by azuzin37 on 8/17/16. Yes, indeed.
 */

fun <A, S> unit(a: A): State<A, S> = State { Pair(a, it) }

fun <A, B, S> State<A, S>.map(f: (A) -> B) = State { s: S ->
    val pair = run(s)
    Pair(f(pair.first), pair.second)
}

fun <A, B, C, S> State<A, S>.map2(s2: State<B, S>, f: (A, B) -> C): State<C, S> = State { s: S ->
    val a = run(s)
    val b = s2.run(a.second)
    Pair(f(a.first, b.first), b.second)
}

fun <A, B, S> State<A, S>.flatMap(f: (A) -> State<B, S>): State<B, S> = State { s: S ->
    val a: Pair<A, S> = run(s)
    f(a.first).run(a.second)
}

fun <A, S> List<State<A, S>>.sequence(): State<List<A>, S> = State { s: S ->
    foldRight(Pair(Nil, s)) {
        a, b: Pair<List<A>, S> ->
        val run: Pair<A, S> = a.run(b.second)
        Pair(Cons(run.first, b.first), run.second)
    }
}