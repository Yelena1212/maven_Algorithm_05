public class ManipulationsWithArrays {

    public int[] multiplуArrayByNumber(int[] array, int number){
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i] * number;
        }
        return newArray;
    }
}
