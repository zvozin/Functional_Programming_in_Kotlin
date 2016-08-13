package me.alexz.ch2_Getting_Started

fun fibonacci(i: Int): Int = when (i) {
    0 -> 0
    1 -> 1
    else -> i + fibonacci(i - 1)
}