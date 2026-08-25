import java.util.Arrays;

class Reverse{
    public void printReverseAnArray(int[] arr,int[] arr2){
        System.out.println("the array without reverse is "+Arrays.toString(arr));
        // int j = 0;
        // for(int i = arr.length-1;i>=0;i--){
        //     arr2[j] = arr[i];
        //     j++;
        // }
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("the reverse array is "+Arrays.toString(arr));
    }
}
public class ReverseAnArray {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr.length];
        r.printReverseAnArray(arr,arr2);
    }
}
