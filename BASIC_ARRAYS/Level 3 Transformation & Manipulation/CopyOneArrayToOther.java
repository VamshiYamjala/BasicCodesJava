import java.util.*;
class Copy{
    public void CopyArray(int[] arr1,int[] arr2){
        System.out.println(Arrays.toString(arr1));
        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
public class CopyOneArrayToOther {
    public static void main(String[] args) {
        Copy c = new Copy();
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length];
        c.CopyArray(arr1, arr2);
    }
}
