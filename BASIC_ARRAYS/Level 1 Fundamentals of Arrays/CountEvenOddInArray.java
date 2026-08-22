import java.util.*;
class EvenOdd{
    public void CountEvenOdd(Scanner sc , int[] arr){
        System.out.println("enter the elements in array one by one ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in the array are "+Arrays.toString(arr));
        int evenCount = 0;
        int oddCount = 0;
        for(int num:arr){
            if(num % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("the even numbers count is "+evenCount);
        System.out.println("the odd number of count is "+oddCount);
    }
}
public class CountEvenOddInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOdd eo = new EvenOdd();
        System.out.println("enter the range of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        eo.CountEvenOdd(sc, arr);
        sc.close();
    }
}
