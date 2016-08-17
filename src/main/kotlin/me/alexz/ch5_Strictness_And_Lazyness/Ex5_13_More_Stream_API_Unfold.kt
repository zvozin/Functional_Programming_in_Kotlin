package me.alexz.ch5_Strictness_And_Lazyness

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.None
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Cons
import me.alexz.ch5_Strictness_And_Lazyness.Stream.Empty

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B> Stream<A>.mapU(f: (A) -> B): Stream<B> = unfold(this) { a: Stream<A> ->
    when (a) {
        is Empty -> None
        is Cons -> Some(Pair(f(a.head.value), a.tail.value))
    }
}

fun <A> Stream<A>.takeU(n: Int): Stream<A> = unfold(Pair(n, this)) { a ->
    val stream = a.second
    if (a.first == 0) None else when (stream) {
        is Empty -> None
        is Cons -> Some(Pair(stream.head.value, Pair(a.first - 1, stream.tail.value)))
    }
}

//  Helper for takeWhile
tailrec fun <A> Stream<A>.skipWhileNot(f: (A) -> Boolean): Stream<A> = when (this) {
    is Empty -> Empty
    is Cons -> if (f(head.value)) this else tail.value.skipWhileNot(f)
}


fun <A> Stream<A>.takeWhileU(f: (A) -> Boolean): Stream<A> = unfold(this) { a ->
    when (a) {
        is Empty -> None
        is Cons -> when (a.skipWhileNot(f)) {
            is Empty -> None
            is Cons -> Some(Pair(a.head.value, a.tail.value))
        }
    }
}

fun <A, B> Stream<A>.zipWith(s: Stream<B>): Stream<Pair<A, B>> = unfold(Pair(this, s)) { ts ->
    val first = ts.first
    val second = ts.second
    if (first is Empty || second is Empty) None
    else Some(Pair(
            Pair((first as Cons).head.value, (second as Cons).head.value),
            Pair(first.tail.value, second.tail.value))
    )
}

//  Helpers for zipAll
fun <A> Stream<A>.headOption(): Option<A> = when (this) {
    is Empty -> None
    is Cons -> Some(head.value)
}

fun <A> Stream<A>.skip() = when (this) {
    is Empty -> Empty
    is Cons -> tail.value
}

fun <A, B> Stream<A>.zipAll(s: Stream<B>): Stream<Pair<Option<A>, Option<B>>> = unfold(Pair(this, s)) { ts ->
    val first = ts.first
    val second = ts.second
    if (first is Empty && second is Empty) None
    else Some(Pair(
            Pair(first.headOption(), second.headOption()),
            Pair(first.skip(), second.skip()))
    )
}