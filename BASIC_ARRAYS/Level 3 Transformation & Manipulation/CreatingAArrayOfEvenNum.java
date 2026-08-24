import java.util.Arrays;

class Even{
    public void ArrayOfEvenNum(int[] arr1){
        int evenCount = 0;
        for(int num:arr1){
            if(num % 2 == 0){
                evenCount++;
            }
        }
        int[] arr2 = new int[evenCount];
        int j =0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] % 2 == 0){
                arr2[j]=arr1[i];
                j++;
            }
        }
        System.out.println("the array 1 elements are "+Arrays.toString(arr1));
        System.out.println("the array 2 elements are "+Arrays.toString(arr2));
    }
}
public class CreatingAArrayOfEvenNum {
    public static void main(String[] args) {
        Even e = new Even();
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        e.ArrayOfEvenNum(arr1);
    }
}
