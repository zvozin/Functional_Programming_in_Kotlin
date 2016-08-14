package me.alexz.ch3_Functional_Data_Structures

import me.alexz.ch3_Functional_Data_Structures.List.Nil
import org.junit.Test
import kotlin.test.assertTrue

/**
 * Created by azuzin37 on 8/13/16. Yes, indeed.
 */
class Ex3_2_TailKtTest {

    @Test
    fun testTail() {
        assertTrue(Nil.tail().equals(Nil.tail()))
        assertTrue(list("2", "1").tail().equals(list("3", "2", "1").tail().tail()))
    }
}