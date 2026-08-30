import java.util.Arrays;

class Reverse1{
    public void ReverseAlternative(int[] arr){
        int CountAel  = (arr.length % 2 == 0) ?  (arr.length/2) : (arr.length/2) + 1;
        int[] arr2 = new int[CountAel];
        int j = 0;
        for(int i = 0 ;i<arr.length;i+=2){
            arr2[j] = arr[i];
            j++;
        }
        int left = 0;
        int right = arr2.length-1;
        while (left < right) {
            int temp = arr2[left];
            arr2[left] = arr2[right];
            arr2[right] = temp;
            left++;
            right--;
        }
        int k = 0;
        for(int i = 0 ;i<arr.length;i+=2){
            arr[i] = arr2[k];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
public class ReverseAlternateElements {
    public static void main(String[] args) {
        Reverse1 r = new Reverse1();
        int[] arr = {1,2,3,4,5,6};
        r.ReverseAlternative(arr);
    }
}
