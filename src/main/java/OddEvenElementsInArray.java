import java.util.Arrays;

public class OddEvenElementsInArray {
    public int[] countOddEvenValuesInArray(int[] array) {
        int[] arrayResult = new int[2];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return arrayResult = new int[]{countEven, countOdd};
    }


    public int[][] createOddEvenArray(int[] array) {
        int evenArray = 0;
        int oddArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray++;
            } else {
                oddArray++;
            }
        }
        System.out.println(evenArray);
        System.out.println(oddArray);

//        int[][] evenOddArray = new int[][]{new int[evenArray], new int[oddArray]};
        int[][] evenOddArray = new int[2][];
        evenOddArray[0] = new int[evenArray];
        evenOddArray[1] = new int[oddArray];

        int ii = 0;
        int jj = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenOddArray[0][ii] = array[i];
                ii++;
            } else {
                evenOddArray[1][jj] = array[i];
                jj++;
            }
        }
        return evenOddArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 34, 2, 6, 7, 8, 3, 0};
        int[][] result = new OddEvenElementsInArray().createOddEvenArray(array);
        System.out.println(Arrays.deepToString(result));
    }
}