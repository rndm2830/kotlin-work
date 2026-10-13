// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    "median when size=1" {
        median(listOf(10.0f)) shouldBe 10.0f plusOrMinus tolerance
    }
    "median when size=2" {
        median(listOf(1.0f, 2.0f)) shouldBe 1.5f plusOrMinus tolerance
    }
    "median when size=3 without sorting" {
        median(listOf(3.0f, 1.0f, 2.0f)) shouldBe 2.0f plusOrMinus tolerance
    }
    "median when size=4 without sorting" {
        median(listOf(4.0f, 2.0f, 1.0f, 3.0f)) shouldBe 2.5f plusOrMinus tolerance
    }
    // Write four more tests here
})
