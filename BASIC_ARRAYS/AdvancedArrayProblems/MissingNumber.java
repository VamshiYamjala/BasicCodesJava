import java.util.*;
class Missing{
    public void MissingInArray(int[] arr){
        Arrays.sort(arr);
        int missing = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] - arr[i-1] != 1){
                missing = arr[i - 1] + 1;
            }
        }
        System.out.println(missing);
    }
}
public class MissingNumber {
    public static void main(String[] args) {
        Missing m = new Missing();
        int[] arr = {1,2,3,5,6,7,8};
        m.MissingInArray(arr);
    }
}
