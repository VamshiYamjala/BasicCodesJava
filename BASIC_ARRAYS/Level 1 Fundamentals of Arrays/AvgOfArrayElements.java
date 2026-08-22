import java.util.*;
class Avg{
    public void AvgOfElements(Scanner sc , int[] arr){
        System.out.println("enter the values in the array one by one ");
        int avg = 0;
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
            avg += arr[i];
        }
        System.out.println("The elements in the array are "+Arrays.toString(arr));
        System.out.println("the avg of the array elements are "+(avg/arr.length));
    }
}
public class AvgOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avg a = new Avg();
        System.out.println("enter the range of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        a.AvgOfElements(sc, arr);
        sc.close();
    }
}
