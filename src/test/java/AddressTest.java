import org.jonas.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTest {
    @Test
    public void testIsPostalCodeValid1() {
        boolean expectedResult = true;
        boolean result = Address.isPostalCodeValid("H8N 3B3");

        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testIsPostalCodeValid2() {
        boolean expectedResult = true;
        boolean result = Address.isPostalCodeValid("h8n3b3");

        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testIsPostalCodeValid3() {
        boolean expectedResult = false;
        boolean result = Address.isPostalCodeValid("A3U4E83");

        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testIsPostalCodeValid4() {
        boolean expectedResult = false;
        boolean result = Address.isPostalCodeValid(null);
    }
    @Test
    public void testIsPostalCodeValid5() {
        boolean expectedResult = false;
        boolean result = Address.isPostalCodeValid("");
    }
}
