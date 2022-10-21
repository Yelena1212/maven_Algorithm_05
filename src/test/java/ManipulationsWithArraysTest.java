import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testMultiplyArrayByNumber_HappyPath(){
        int[] array = {4, 5, 6, 7, 8, 9, 10};
        int number = 2;

        int[] expectedResult = {8, 10, 12, 14, 16, 18, 20};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
