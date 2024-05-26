import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.Util;

public class UtilTest {
    @Test
    public void testToTitleCase1() {
        String strIn = "jonas almeida";
        String expectedResult = "Jonas Almeida";
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testToTitleCase2() {
        String strIn = "osvaldo cruz ribeiro pinto de orvalho nascimento";
        String expectedResult = "Osvaldo Cruz Ribeiro Pinto De Orvalho Nascimento";
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testToTitleCase3() {
        String strIn = "jOnAS ALMeidA";
        String expectedResult = "Jonas Almeida";
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testToTitleCase4() {
        String strIn = null;
        String expectedResult = null;
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testToTitleCase5() {
        String strIn = "";
        String expectedResult = "";
        String result = Util.toTitleCase(strIn);
        Assertions.assertEquals(expectedResult, result);
    }

}
