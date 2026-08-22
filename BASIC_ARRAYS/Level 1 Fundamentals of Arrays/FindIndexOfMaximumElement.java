import java.util.*;
class MaxIndex{
    public void FindMaxIndex(Scanner sc , int[] arr){
        System.out.println("enter the elements in array one by one ");
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in the array are "+Arrays.toString(arr));
        int maximum = arr[0];
        for(int max : arr){
            if(maximum < max){
                maximum = max;
            }
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j]==maximum){
                System.out.println("the index of Maximum element is "+j);
            }
        }
        // System.out.println("the index of Maximum element is "+Arrays.asList(arr).indexOf(maximum));
    }
}
public class FindIndexOfMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxIndex mi = new MaxIndex();
        System.out.println("enter the range of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        mi.FindMaxIndex(sc, arr);
        sc.close();
    }
}
