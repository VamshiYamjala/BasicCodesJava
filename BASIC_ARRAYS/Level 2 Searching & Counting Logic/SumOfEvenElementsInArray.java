import java.util.Arrays;

class Even{
    public void SumOfEvenInArray(int[] arr){
        int EvenSum = 0;
        for(int num:arr){
            if(num % 2 == 0){
                EvenSum += num;
            }
        }
        System.out.println("the even sum of the array is "+EvenSum);
        System.out.println("the elements in the array is "+Arrays.toString(arr));
    }
}
public class SumOfEvenElementsInArray {
    public static void main(String[] args) {
        Even e = new Even();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        e.SumOfEvenInArray(arr);
    }
}
