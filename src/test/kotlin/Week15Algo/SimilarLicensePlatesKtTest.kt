package Week15Algo

import org.junit.Test

import org.junit.Assert.*

class SimilarLicensePlatesKtTest {
        @Test
        fun shouldHandleDifferent1() {
            assertEquals(false, similarLicensePlates("ABC", "DEF"))
        }

        @Test
        fun shouldHandleDifferent2() {
            assertEquals(false, similarLicensePlates("123", "456"))
        }

        @Test
        fun shouldHandleDifferentOrder() {
            assertEquals(false, similarLicensePlates("10", "IZO"))
        }

        @Test
        fun shouldHandleSameInput() {
            assertEquals(true, similarLicensePlates("ABC", "ABC"))
        }

        @Test
        fun shouldHandleSpaces() {
            assertEquals(true, similarLicensePlates("AAA", "A A A"))
        }

        @Test
        fun shouldMatchSingleCharacters() {
            assertEquals(true, similarLicensePlates("BOX", "B0X"))
        }

        @Test
        fun shouldMatchManyCharacters() {
            assertEquals(true, similarLicensePlates("BIZ", "812"))
        }

        @Test
        fun shouldMatch0oq() {
            assertEquals(true, similarLicensePlates("A00BOOCQQ", "AOQB0QC0O"))
        }

        @Test
        fun shouldMatch1it() {
            assertEquals(true, similarLicensePlates("A11BIICTT", "AITB1TC1I"))
        }

        @Test
        fun shouldMatch2z() {
            assertEquals(true, similarLicensePlates("A2BZC", "AZB2C"))
        }

        @Test
        fun shouldMatch5s() {
            assertEquals(true, similarLicensePlates("A5BSC", "ASB5C"))
        }

        @Test
        fun shouldMatch8b() {
            assertEquals(true, similarLicensePlates("A8BBC", "ABB8C"))
        }

        @Test
        fun shouldWorkOnBapBog() {
            assertEquals(false, similarLicensePlates("BAP", "BOG"))
        }

        @Test
        fun shouldWorkOnOxb0bx() {
            assertEquals(false, similarLicensePlates("OXB", "0BX"))
        }

        @Test
        fun shouldWorkOnBoxB0b() {
            assertEquals(false, similarLicensePlates("BOX", "B0B"))
        }

        @Test
        fun shouldWorkOnAcdEfg() {
            assertEquals(false, similarLicensePlates("ACD", "EFG"))
        }

        @Test
        fun shouldWorkOnAbcAAA() {
            assertEquals(false, similarLicensePlates("ABC", "A A A"))
        }

        @Test
        fun shouldWorkOnBigBig() {
            assertEquals(true, similarLicensePlates("BIG", "BIG"))
        }

        @Test
        fun shouldWorkOnBisBi5() {
            assertEquals(true, similarLicensePlates("BIS", "BI5"))
        }

        @Test
        fun shouldWorkOnBi5Bis() {
            assertEquals(true, similarLicensePlates("BI5", "BIS"))
        }

        @Test
        fun shouldWorkOnBqaBoa() {
            assertEquals(true, similarLicensePlates("BQA", "BOA"))
        }

        @Test
        fun shouldWorkOnBqcB0c() {
            assertEquals(true, similarLicensePlates("BQC", "B0C"))
        }

        @Test
        fun shouldWorkOnBodB0d() {
            assertEquals(true, similarLicensePlates("BOD", "B0D"))
        }

        @Test
        fun shouldWorkOnBoeBqe() {
            assertEquals(true, similarLicensePlates("BOE", "BQE"))
        }

        @Test
        fun shouldWorkOnB0fBof() {
            assertEquals(true, similarLicensePlates("B0F", "BOF"))
        }

        @Test
        fun shouldWorkOnB0gBqg() {
            assertEquals(true, similarLicensePlates("B0G", "BQG"))
        }

        @Test
        fun shouldWorkOnBoh8oh() {
            assertEquals(true, similarLicensePlates("BOH", "8OH"))
        }

        @Test
        fun shouldWorkOn8ojBoj() {
            assertEquals(true, similarLicensePlates("8OJ", "BOJ"))
        }

        @Test
        fun shouldWorkOnBikB1k() {
            assertEquals(true, similarLicensePlates("BIK", "B1K"))
        }

        @Test
        fun shouldWorkOnB1lBil() {
            assertEquals(true, similarLicensePlates("B1L", "BIL"))
        }

        @Test
        fun shouldWorkOnZom2om() {
            assertEquals(true, similarLicensePlates("ZOM", "2OM"))
        }

        @Test
        fun shouldWorkOn2onZon() {
            assertEquals(true, similarLicensePlates("2ON", "ZON"))
        }
}