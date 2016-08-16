# Functional Programming in Kotlin

This is a repository of exercises from @pchuisano and @runorama's eminent book ["Function Programming in Scala"](https://www.manning.com/books/functional-programming-in-scala), implemented [koan-style](https://sinairv.wordpress.com/2012/05/27/programming-koans-one-of-the-best-ways-to-learn-a-new-language-or-framework) in [Kotlin](http://kotlinlang.org).

## Why Kotlin

Kotlin is the new heir apparent to Java, developed open-source style by [Jetbrains](https://www.jetbrains.com) (the IntelliJ guys.) Goodies include:
- static typing with generics and proper variance
- a neat lambda syntax
- collections with syntactic sugars
- operator overloading w/infix syntax
- a [first-class extension facility](https://kotlinlang.org/docs/reference/extensions.html)
- [sealed classes](https://kotlinlang.org/docs/reference/classes.html to express ADTs
- *when* statement that's half way between a switch and a pattern-match
- language-level null-safety (as in Swift)
- quick compiles
- extensive tool support (because provenance)

Kotlin's been gaining steam among Android developers and Scala refugees. Take it for a spin:
- if you don't have it yet, get [IntelliJ](https://www.jetbrains.com/idea)
- work through [Kotlin Koans](https://kotlinlang.org/docs/tutorials/koans.html) while keeping the [documentation](http://kotlinlang.org/docs/reference) open 

You will then be ready to tackle these.

## Notes

- The Kotlin versions of the exercises typically define extension functions where the Scala originals use standalones. This is my personal preference of what I felt to be more idiomatic for a rightward-growing, OO-heritaged language
- Consider *NOT* using what you implement here in production code
