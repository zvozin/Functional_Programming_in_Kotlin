package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.None
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B> Option<A>.map(f: (A) -> B): Option<B> = when (this) {
    is Some -> try {
        Some(f(value))
    } catch(e: Exception) {
        None
    }
    is None -> None
}

fun <A, B> Option<A>.flatMap(f: (A) -> Option<B>): Option<B> = when (this) {
    is Some -> try {
        f(value)
    } catch(e: Exception) {
        None
    }
    is None -> None
}

fun <A> Option<A>.getOrElse(a: Lazy<A>): A = when (this) {
    is Some -> value
    is None -> a.value
}

fun <A> Option<A>.orElse(a: Lazy<Option<A>>): Option<A> = when (this) {
    is Some -> this
    is None -> a.value
}

fun <A> Option<A>.filter(f: (A) -> Boolean): Option<A> = when (this) {
    is Some -> if (f(value)) this else None
    is None -> None
}