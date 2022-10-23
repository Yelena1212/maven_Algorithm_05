import java.util.Arrays;

public class Utils {

    public static boolean arrayIsEmpty(int[] array){
        return array.length != 0;
    }

    public static boolean isExistInArr(int[]arr,int a){
        if (arr == null || arr.length == 0) {
            return false;
        }
        for(int i:arr){
            if(i==a){
                return true;
            }
        }
        return false;
    }

    public static int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }
}
