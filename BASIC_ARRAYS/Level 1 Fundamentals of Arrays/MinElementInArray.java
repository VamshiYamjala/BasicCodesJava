import java.util.*;
class Minimum{
    public void MinValueInArray(Scanner sc,int[] arr){
        System.out.println("enter the element one by one ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in array is "+Arrays.toString(arr));
        int minimum = arr[0];
        for(int min:arr){
            if(minimum > min){
                minimum = min;
            }
        }
        System.out.println("the minimum element in array is "+minimum);
    }
}
public class MinElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of elements in array");
        int n = sc.nextInt();
        Minimum mi = new Minimum();
        int[] arr = new int[n];
        mi.MinValueInArray(sc, arr);
        sc.close();
    }
}
