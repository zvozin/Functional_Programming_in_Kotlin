package me.alexz.ch3_Functional_Data_Structures

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */

fun List<Int>.sum(): Int = this.foldLeft(0) { a: Int, s: Int -> a + s }

fun List<Double>.product(): Double = this.foldLeft(0.0) { a: Double, s: Double -> a * s }

fun <A> List<A>.lengthLeft(): Int = this.foldLeft(0) { a: A, s: Int -> s + 1 }