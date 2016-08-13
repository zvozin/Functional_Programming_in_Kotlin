package me.alexz.ch2_Getting_Started

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex2_4_UncarryKtTest {

    @Test
    fun testUncarry() {
        assertEquals(2, { i: Int -> { j: Int -> i + j } }.uncarry().invoke(1, 1))
    }
}