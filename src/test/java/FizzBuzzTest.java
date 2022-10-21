import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

   @Test
   public void testStartLessThanEnd_HappyPath() {
      int start = 2;
      int end = 20;
      String[] expectedResult = {"2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
              "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

      String[] actualResult = new FizzBuzz().FizzBuzz(start, end);
      Assert.assertEquals(actualResult, expectedResult);
   }

   @Test
   public void testStartEqualsEnd_HappyPath() {
      int start = 2;
      int end = 2;
      String[] expectedResult = {"2"};

      String[] actualResult = new FizzBuzz().FizzBuzz(start, end);
      Assert.assertEquals(actualResult, expectedResult);
   }

//   @Test
//   public void testStartLessThanEndAreNegative_HappyPath(){
//      int start = -20;
//      int end = -2;
//      String[] expectedResult = {"2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
//              "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
//
//      String[] actualResult = new FizzBuzz().FizzBuzz(start, end);
//      Assert.assertEquals(actualResult, expectedResult);
//
//}

   @Test
   public void testStartGreaterThanEnd_Negative() {
      int start = 20;
      int end = 1;
      String[] expectedResult = {};

      String[] actualResult = new FizzBuzz().FizzBuzz(start, end);
      Assert.assertEquals(actualResult, expectedResult);
   }
}