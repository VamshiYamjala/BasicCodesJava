import java.util.*;
class PrintNum{
    public void SumOfNumInArray(Scanner sc , int[] arr){
        int sum = 0;
        System.out.println("enter the elements in the array");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("the elements in the array are "+Arrays.toString(arr));
        System.out.println("the sum of elements in the array are "+sum);
    }
}
public class SumOfAllIntegerInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the range of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        pn.SumOfNumInArray(sc,arr);
        sc.close();
    }
}
