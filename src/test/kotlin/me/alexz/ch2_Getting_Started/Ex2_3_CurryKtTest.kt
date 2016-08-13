package me.alexz.ch2_Getting_Started

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex2_3_CurryKtTest {
    @Test
    fun testCurry() {
        assertEquals(2, {i1: Int, i2: Int -> i1 + i2}.curry().invoke(1).invoke(1))
    }
}