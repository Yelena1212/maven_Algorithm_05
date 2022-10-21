import org.testng.Assert;
import org.testng.annotations.Test;

public class createArrayTest {

    @Test
    public void testIntArray_HappyPath(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int f = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new createArray().createIntArray(a, b, c, d, f);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

