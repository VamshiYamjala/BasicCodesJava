import java.util.Arrays;

class Odd{
    public void SumOfOddInArray(int[] arr){
        int OddSum = 0;
        for(int num:arr){
            if(num % 2 != 0){
                OddSum += num;
            }
        }
        System.out.println("the Odd sum of the array is "+OddSum);
        System.out.println("the elements in the array is "+Arrays.toString(arr));
    }
}
public class SumOfOddElementsInArray {
    public static void main(String[] args) {
        Odd o = new Odd();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        o.SumOfOddInArray(arr);
    }
}
