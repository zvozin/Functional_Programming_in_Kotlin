package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch4_Handling_Errors_Without_Exceptions.Either.Left
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Either.Right

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B, C> Either<A , B>.map(f: (B) -> C): Either<A, C> = when (this) {
    is Left -> Left(value)
    is Right -> Right(f(value))
}

fun <A, B, C> Either<A, B>.flatMap(f: (B) -> Either<A, C>): Either<A, C> = when(this){
    is Left -> Left(value)
    is Right -> f(value)
}

fun <A, B> Either<A, B>.orElse(f: Lazy<Either<A, B>>): Either<A, B> = when(this){
    is Left -> f.value
    is Right -> this
}

fun <A, B, C, D> Either<A, B>.map2(other: Either<A, C>, f: (B, C) -> D): Either<A, D> =
        flatMap {b -> other.map{ f(b, it)} }
