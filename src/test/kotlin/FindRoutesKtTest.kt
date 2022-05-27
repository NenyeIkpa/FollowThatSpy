import org.junit.Assert.*
import org.junit.Test

class FindRoutesKtTest{

    @Test
    fun fiveCityAcronyms() {
        assertEquals("MNL, TAG, CEB, TAC, BOR", findRoutes(arrayListOf<ArrayList<String>>(arrayListOf<String>("MNL", "TAG"), arrayListOf<String>("CEB", "TAC"), arrayListOf<String>("TAG", "CEB"), arrayListOf<String>("TAC", "BOR"))))
    }

    @Test
    fun sixFullCityNames() {
        assertEquals("Halifax, Montreal, Toronto, Chicago, Winnipeg, Seattle", findRoutes(arrayListOf<ArrayList<String>>(arrayListOf<String>("Chicago", "Winnipeg"), arrayListOf<String>("Halifax", "Montreal"), arrayListOf<String>("Montreal", "Toronto"), arrayListOf<String>("Toronto", "Chicago"), arrayListOf<String>("Winnipeg", "Seattle"))))
    }
}