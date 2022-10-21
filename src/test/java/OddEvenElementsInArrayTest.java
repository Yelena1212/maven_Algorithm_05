import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenElementsInArrayTest {

    @Test
    public void OddEvenElementsInArray() {
        int[] array = {3, 5, 7, 2, 6, 1, 9, 12};
        int[] expectedResult = {3, 5};
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
