package me.alexz.ch2_Getting_Started

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex2_2_Is_Array_SortedKtTest {
    @Test
    fun testIsSorted() {
        assertTrue(arrayOf(4, 3, 2, 1).isSorted { i1: Int, i2: Int -> i1 > i2 })
        assertTrue(arrayOf(1, 2, 3, 4).isSorted { i1: Int, i2: Int -> i1 < i2 })
    }
}