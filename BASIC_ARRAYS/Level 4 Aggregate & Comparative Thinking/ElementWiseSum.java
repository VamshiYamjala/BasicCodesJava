import java.util.Arrays;

class Sum{
    public void ElementWiseSum(int[] arr,int[] arr2){
        int[] sumarr =new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            sumarr[i] = (arr[i]+arr2[i]);
        }
        System.out.println(Arrays.toString(sumarr));
    }
}
public class ElementWiseSum {
    public static void main(String[] args) {
        Sum s = new Sum();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        s.ElementWiseSum(arr, arr2);
    }
}
