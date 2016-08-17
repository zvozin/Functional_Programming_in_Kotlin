package me.alexz.ch5_Strictness_And_Lazyness

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */


/**
 * Non-strict Stream<A>.
 *
 * Note that the mechanics of forcing lazy caching in Scala do NOT apply to
 * Kotlin's Lazy<A> - it explicitly caches the value.
 */
sealed class Stream<out A> {
    object Empty : Stream<Nothing>()
    class Cons<out A>(val head: Lazy<A>, val tail: Lazy<Stream<A>>) : Stream<A>()

    fun <B> foldRight(seed: Lazy<B>, f: (A, Lazy<B>) -> B): B = when (this) {
        is Empty -> seed.value
        is Cons -> f(head.value, lazy { tail.value.foldRight(seed, f) })
    }
}