import java.util.Arrays;

class Sort{
    public void MergeTwoArray(int[] arr,int[] arr2){
        int[] mergedArray = new int[arr.length+arr2.length];
        System.arraycopy(arr,0,mergedArray,  0, arr.length);
        System.arraycopy(arr2, 0, mergedArray, arr.length, arr2.length);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
}
public class Merge2Array {
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] arr = {1,2,3,4};
        int[] arr2 ={6,7,8,9,10};
        s.MergeTwoArray(arr, arr2);
    }
}
