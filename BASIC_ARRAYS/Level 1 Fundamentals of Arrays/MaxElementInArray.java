import java.util.*;
class Maximum{
    public void MaxElement(Scanner sc , int[] arr){
        System.out.println("enter the number in array one by one ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in the array is "+Arrays.toString(arr));
        int maximun = arr[0];
        for(int max:arr){
            if(maximun < max){
                maximun = max;
            }
        }
        System.out.println("the maximun element in the array is "+maximun);
    }
}
public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maximum m = new Maximum();
        System.out.println("enter the range of elements into the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        m.MaxElement(sc, arr);
        sc.close();
    }
}
