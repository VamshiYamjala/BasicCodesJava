import java.util.Arrays;

class Zeros{
    public void MovingZerosInArray(int[] arr){
        int[] newarr = new int[arr.length];
        int countZero = 0;
        int j  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                countZero++;
                continue;
            }
            newarr[j] = arr[i];
            j++;
        }
        for(int k = (arr.length - countZero);k<newarr.length;k++){
            newarr[k] = 0;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
public class MovingZeros {
    public static void main(String[] args) {
        Zeros z = new Zeros();
        int[] arr = {0, 1, 0, 3, 12};
        z.MovingZerosInArray(arr);
    }
}
