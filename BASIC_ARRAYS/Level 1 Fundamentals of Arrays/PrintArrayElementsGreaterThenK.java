import java.util.*;
class Greater{
    public void PrintElementsGreaterThenk(Scanner sc,int[] arr,int k){
        System.out.println("enter the values into the array one by one ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elements in the array are "+Arrays.toString(arr));
        for(int num:arr){
            if(num > k){
                System.out.println("the value greater the k "+num);
            }
        }
    }
}
public class PrintArrayElementsGreaterThenK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greater g = new Greater();
        System.out.println("enter the range of the array ");
        int n = sc.nextInt();
        System.out.println("enter the element k to get greater the k elements from array ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        g.PrintElementsGreaterThenk(sc, arr,k);
        sc.close();
    }
}
