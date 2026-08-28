import java.util.Arrays;

class Rotate{
    public void RotateAnArray(int[] arr,int k){
        if(k>arr.length){
            k %= arr.length;
        }
        int slice = arr.length - k;
        int[] first = new int[slice];
        int[] second = new int[arr.length - slice];
        for(int i = 0;i<arr.length;i++){
            if(i < slice){
                first[i] = arr[i];
            }
            else{
                second[i - slice] = arr[i];
            }
        }
        System.arraycopy(second, 0, arr, 0, second.length);
        System.arraycopy(first, 0, arr,second.length, first.length);
        System.out.println(Arrays.toString(arr));
    }
}
public class RotateAnArrayByKPosition {
    public static void main(String[] args) {
        Rotate r = new Rotate();
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        r.RotateAnArray(arr, k);
    }
}
