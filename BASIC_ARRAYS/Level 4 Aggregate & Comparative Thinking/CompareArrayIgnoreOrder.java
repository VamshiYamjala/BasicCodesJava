import java.util.*;
class CompareArrayI{
    public void twoArrayComparsion(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("the 2 arrays are not same ");
            return;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                System.out.println("The 2 arrays are not same ");
                return;
            }
        }
        System.out.println("the 2 arrays are same");

    }
}
public class CompareArrayIgnoreOrder {
    public static void main(String[] args) {
        CompareArrayI ca = new CompareArrayI();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        ca.twoArrayComparsion(arr1, arr2);
    }
    
}
