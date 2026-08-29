import java.util.Arrays;

class Merge{
    public void sortMerge(int[] arr1,int[] arr2){
        int[] mergeArray = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
    }
}
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Merge m = new Merge();
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        m.sortMerge(arr1, arr2);
    }
}
