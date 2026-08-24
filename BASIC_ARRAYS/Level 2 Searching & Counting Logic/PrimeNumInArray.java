import java.util.*;
class Prime{
    public void CountPrime(Scanner sc,int[] arr){
        System.out.println("enter the values into the array one by one ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in the array are "+Arrays.toString(arr));
        int PrimeCount = 0;
        for(int num:arr){
            int count = 0;
            for(int i = 1;i<=num;i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                PrimeCount++;
            }
        }
        System.out.println("the prime count in the array is "+PrimeCount);
    }
}
public class PrimeNumInArray {
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        p.CountPrime(sc, arr);
        sc.close();
    }
}
