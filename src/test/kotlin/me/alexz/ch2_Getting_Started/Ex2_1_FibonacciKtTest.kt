package me.alexz.ch2_Getting_Started

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex2_1_FibonacciKtTest {
    @Test
    fun testFibonacci() {
        assertEquals(0, fibonacci(0))
        assertEquals(1, fibonacci(1))
        assertEquals(3, fibonacci(2))
        assertEquals(15, fibonacci(5))
    }
}