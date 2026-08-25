import java.util.*;
class Compare{
    public void CompareArray(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("no the 2 arrays are not same");
            return;
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                System.out.println("no the arrays are not same");
                return;
            }
        }

            System.out.println("both array have same element");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
public class Compare2ArrayOrderAlso{
    public static void main(String[] args) {
        Compare c = new Compare();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        c.CompareArray(arr1, arr2);
    }
}