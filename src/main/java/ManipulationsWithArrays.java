public class ManipulationsWithArrays {

    public int[] multiplуArrayByNumber(int[] array, int number) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * number;
        }
        return newArray;
    }

    public int[] getTheGreaterHalf(int[] array) {
        int sumFirstHalf = 0;
        int firstCount = 0;
        int sumSecondHalf = 0;
        int secondCount = 0;
        int[] firstHalfArray = new int[firstCount];
        int[] secondHalfArray = new int[secondCount];

        for (int i = 0; i <= array.length / 2; i++) {
            sumFirstHalf += array[i];
            firstCount++;
        }
        System.out.println(sumFirstHalf);
        for (int i = array[array.length -1]; i >= array.length/2; i--) {
            sumSecondHalf += array[i];
            secondCount++;
        }
        System.out.println(sumSecondHalf);

        if (sumFirstHalf > sumSecondHalf) {
            for (int i = 0; i < array.length / 2; i++) {
                firstHalfArray[i] = array[i];
            }
            return firstHalfArray;
        } else {
            for (int i = firstCount + 1; i < array.length; i++) {
                secondHalfArray[i] += array[i];
            }
            return secondHalfArray;
        }
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = new ManipulationsWithArrays().getTheGreaterHalf(array);
        System.out.println(result);
    }
}