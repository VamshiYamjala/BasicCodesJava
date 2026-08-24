import java.util.*;
class EvenOdd{
    public void replaceEvenWith1OddWith0(int[] arr){
        System.out.println("the elements before replace in array "+Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                arr[i] = 1;
            }
            else if(arr[i] % 2 != 0){
                arr[i] = 0;
            }
        }
        System.out.println("the elements in array "+Arrays.toString(arr));
    }
}
public class EvenWith1OddWith0 {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        eo.replaceEvenWith1OddWith0(arr);
    }
}
