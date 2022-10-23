import java.util.Arrays;

public class Intersection {

    public int[] Intersection(int[] array, int[] array2) {

        boolean check = Utils.arrayIsEmpty(array);
        boolean check2 = Utils.arrayIsEmpty(array2);
        int resultArrayLength = 0;


        if (check && check2) {
            for (int i = 0; i <= array.length - 1; i++) {
                for (int j = 0; j <= array2.length - 1; j++) {
                    if (array[i] == array2[j]) {
                        resultArrayLength++;
                        break;
                    }
                }
            }
        }

        int[] sameElementsArray = new int[resultArrayLength];
        int index = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array2.length -1; j++) {
                if (array[i] == array2[j]) {
                    sameElementsArray[index] = array[i];
                    index++;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(sameElementsArray));
        return sameElementsArray;

    }


    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8, 9};
        int[] array2 = {1, 4, 6, 8, 9, 3};

        int[] result = new Intersection().Intersection(array, array2);
        System.out.println(Arrays.toString(result));
    }
}