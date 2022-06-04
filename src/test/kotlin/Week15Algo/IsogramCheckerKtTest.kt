package Week15Algo

import org.junit.Test

import org.junit.Assert.*

class IsogramCheckerKtTest {

    @Test
    fun shouldBeTrueForDermatoglyphics() {
        assertEquals(true, isIsogram("Dermatoglyphics"))
    }

    @Test
    fun shouldBeFalseForMoose() {
        assertEquals(false, isIsogram("moose"))
    }

    @Test
    fun shouldHandleNonAdjacentLetters() {
        assertEquals(false, isIsogram("aba"))
    }

    @Test
    fun shouldIgnoreCase() {
        assertEquals(false, isIsogram("moOse"))
    }

    @Test
    fun shouldHandleEmptyStrings() {
        assertEquals(true, isIsogram(""))
    }

    @Test
    fun shouldBeTrueForThumbscrewjapingly() {
        assertEquals(true, isIsogram("thumbscrewjapingly"))
    }

    @Test
    fun shouldBeFalseForAa() {
        assertEquals(false, isIsogram("aa"))
    }

    @Test
    fun shouldBeTrueForA() {
        assertEquals(true, isIsogram("a"))
    }
}