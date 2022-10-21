public class OddEvenElementsInArray {
    public int[] countOddEvenValuesInArray(int[] array){
        int[] arrayResult = new int[2];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                countEven++;
            } else{
                countOdd++;
            }
        }
        return arrayResult = new int[]{countEven, countOdd};
    }
}
