import java.util.*;
class Shift{
    public void LeftShift(int[] arr){
        int temp = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
public class LeftShiftInArray {
    public static void main(String[] args) {
        Shift s = new Shift();
        int[] arr = {1,2,3,4,5};
        s.LeftShift(arr);
    }
}
