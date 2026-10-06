// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of -1 gives question mark`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of -10 gives question mark`() {
        assertEquals("?", grade(-10))
    }

    // --- 等价类 2: 0..39 (边界值: 0, 39，典型值: 20) ---
    @Test
    fun `Mark of 0 gives Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 20 gives Fail`() {
        assertEquals("Fail", grade(20))
    }

    @Test
    fun `Mark of 39 gives Fail`() {
        assertEquals("Fail", grade(39))
    }

    // --- 等价类 3: 40..69 (边界值: 40, 69，典型值: 55) ---
    @Test
    fun `Mark of 40 gives Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 55 gives Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 69 gives Pass`() {
        assertEquals("Pass", grade(69))
    }

    // --- 等价类 4: 70..100 (边界值: 70, 100，典型值: 85) ---
    @Test
    fun `Mark of 70 gives Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 85 gives Distinction`() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `Mark of 100 gives Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    // --- 等价类 5: mark > 100 (边界值: 101，典型值: 110) ---
    @Test
    fun `Mark of 101 gives question mark`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of 110 gives question mark`() {
        assertEquals("?", grade(110))
    }
}
