package me.alexz.ch2_Getting_Started

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex2_5_ComposeKtTest {

    @Test
    fun testCompose() {
        assertEquals(1, ({i: Int -> i*2} compose {i: Int -> i/2}).invoke(1))
    }
}