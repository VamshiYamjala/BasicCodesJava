import java.util.Arrays;

class Sorted{
    public void SortedSquare(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr2[i] = arr[i] * arr[i];
        }
        int left = 1;
        int next = 0;
        while(left < arr2.length){
            if(arr2[left] > arr2[left-1]){
                int temp = arr2[left];
                arr2[left] = arr2[left-1];
                arr2[left-1] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
public class SortedSquareArray {
    public static void main(String[] args) {
        Sorted s = new Sorted();
        int[] arr = {-4,-1,0,1,3};
        s.SortedSquare(arr);
    }
}
