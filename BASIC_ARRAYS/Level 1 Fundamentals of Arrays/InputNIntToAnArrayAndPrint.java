import java.util.*;
class Input{
    public void inputArrayAndPrint(Scanner sc ,int[] arr){
        System.out.println("enter the values in the array one by one");
        for(int i = 0 ; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array elements are"+Arrays.toString(arr));
    }
}
public class InputNIntToAnArrayAndPrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array of numbers ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Input i = new Input();
        i.inputArrayAndPrint(sc,arr);
        sc.close();
    }
}