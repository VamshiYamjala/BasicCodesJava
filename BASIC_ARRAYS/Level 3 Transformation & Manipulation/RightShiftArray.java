import java.util.*;
class RShift{
    public void rightShift(int[] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
public class RightShiftArray {
    public static void main(String[] args) {
        RShift rs = new RShift();
        int[] arr = {1,2,3,4,5};
        rs.rightShift(arr);
    }
}
