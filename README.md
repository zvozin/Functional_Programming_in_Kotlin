# Functional Programming in Kotlin

This is a repository of exercises from @pchuisano and @runorama's seminal book ["Function Programming in Scala"](https://www.manning.com/books/functional-programming-in-scala), implemented [koan-style](https://sinairv.wordpress.com/2012/05/27/programming-koans-one-of-the-best-ways-to-learn-a-new-language-or-framework) in [Kotlin](http://kotlinlang.org). Exercices that can't have unit-testable results - i.e. "consider how you would" exercises - are skipped, as are exercises marked *Hard*.

## Why Kotlin

Kotlin is the new heir apparent to Java, developed open-source style by [Jetbrains](https://www.jetbrains.com) (the IntelliJ guys.) Goodies include:
- static typing with generics and proper variance
- neat lambda syntax
- operator overloading w/infix syntax
- [first-class extension facility](https://kotlinlang.org/docs/reference/extensions.html)
- [sealed classes](https://kotlinlang.org/docs/reference/classes.html) to express ADTs
- `when` statement - half way between a `switch` and a pattern-match
- language-level null-safety (as in Swift)
- quick compiles
- extensive tool support (because provenance)

Kotlin's been gaining steam among Android developers and Scala refugees. Take it for a spin:
- if you don't have it yet, get [IntelliJ](https://www.jetbrains.com/idea)
- work through [Kotlin Koans](https://kotlinlang.org/docs/tutorials/koans.html) while keeping the [documentation](http://kotlinlang.org/docs/reference) open 

You will then be ready to tackle these.

## What you're getting into

NOTE: The book builds functional programming concepts from first principles to monads, applicatives and pure stream I/O in 15 chapters, with 10-20 coding exercices each. That's easily *a couple of weeks* worth of week-night reading and coding. Take the chapters in order, and pace yourself.

## Pertinent differences between Scala and Kotlin

Kotlin differs from Scala three ways: some things are missing, others are different, others are in Kotlin but not in Scala. A few differences I consider worth mentioning off the bat are below.

#### Not in Kotlin

- `for` comprehension. There's none. Spelling out all the `flatMap`s has the obvious up- and down-sides
- there's no `a: => A`-style syntactic sugar for non-strict arguments. You have to explicitly use `Lazy<A>`
- there's no `()` syntactic sugar for tuples. You have to explicitly use `Pair<A, B>` or `Triple<A, B, C>`

#### Different between Kotlin and Scala

- `when` is not a Scala pattern-match. You can't implement `unapply()` for a type, and there are no variable assignments. It does its own neat tricks, though: 
    1. automatically casts the match subject when matching on class
    2. doesn't require explicit source reference on the right side of such matches
- only one lambda argument can be anonymous, and is referred to as `it` rather than `_`. In exchange, the `it` reference can be used in a lambda any number of times without confusion
- `typealias`es are not available until [Kotlin 1.1](https://blog.jetbrains.com/kotlin/2016/07/first-glimpse-of-kotlin-1-1-coroutines-type-aliases-and-more)

#### Not in Scala
- first-class [extension functions](https://kotlinlang.org/docs/reference/extensions.html) without having to resort to `implicit` type conversion, which:
    1. allow fully type-safe extension (not type classes, though - you can't yet implement an interface like this)
    2. obviate the [tyranny of dominant decomposition](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.9.5189&rep=rep1&type=pdf), which the authors mention when discussing `sequence`-ing of a `List` of `Option`s. 
  
Virtualy *everything* in these koans is implemented as extension functions.

# Thanks

These koans constitute:
- a thank you to Paul Chiusano and Rúnar Bjarnason for writing a seminal book on functional programming
- a thank you to Andrew Breslav and his team at Jetbrains for putting together a highly viable alternative to Java

I'd also like to thank Paul and Rúnar for originating possibly the single most popular functional programming meme that a colleague of mine once aptly expressed as an interview question:

> Q: under what circumstances do you flatMap that sh*t?
>
> A: always - this ain't no amateur hour!

# Enjoy 

Comments and improvements are welcome - just submit an issue. 
