package me.alexz.ch2_Getting_Started

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun <A> Array<A>.isSorted(ordered: (A, A) -> Boolean): Boolean {
    for (i in 0..this.size - 2) {
        if (!ordered(this[i], this[i + 1])) return false
    }
    return true
}
