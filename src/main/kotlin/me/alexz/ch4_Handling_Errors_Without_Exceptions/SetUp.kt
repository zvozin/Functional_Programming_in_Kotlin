package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.List.Cons
import me.alexz.ch3_Functional_Data_Structures.List.Nil
import me.alexz.ch3_Functional_Data_Structures.sum
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.None
import me.alexz.ch4_Handling_Errors_Without_Exceptions.Option.Some

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

/**
 * The Option ADT
 */
sealed class Option<out A> {
    object None : Option<Nothing>()
    class Some<A>(val value: A) : Option<A>()
}

fun <A, B> lift(f: (A) -> B): (Option<A>) -> Option<B> = { it.map(f)}

fun <A> _try(f: Lazy<A>): Option<A> = try{Some(f.value)}catch(e: Exception){None}

fun List<Double>.mean(): Option<Double> = when(this){
    is Nil -> None
    is Cons -> Some(sum()/size())
}

/**
 * The Either ADT
 */
sealed class Either<out A, out B>{
    class Left<A>(val value: A): Either<A, Nothing>()
    class Right<B>(val value: B): Either<Nothing, B>()
}


