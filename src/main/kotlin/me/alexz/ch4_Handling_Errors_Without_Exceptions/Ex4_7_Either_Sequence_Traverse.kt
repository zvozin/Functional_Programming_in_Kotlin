package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Either.Right

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun <A, B, C> List<B>.traverseEither(f: (B) -> Either<A, C>): Either<A, List<C>> = this.foldRight(Right(Nil)) {
    b, e: Either<A, List<C>> ->
    e.flatMap{lc -> f(b).map{ Cons(it, lc) }}
}

fun <A, B, C> List<B>.sequenceEither(): Either<A, List<B>> =
        traverseEither { Right(it) }