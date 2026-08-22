import java.util.*;
class CountNum{
    public void CountPosNegZeroInArray(Scanner sc , int[] arr){
        System.out.println("enter the elements into the array one by one ");
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elements in the array are "+Arrays.toString(arr));
        int CountPositive=0;
        int CountNegavtive = 0;
        int CountZero = 0;
        for(int num:arr){
            if(num > 0 ){
                CountPositive++;
            }
            else if(num < 0){
                CountNegavtive++;
            }
            else{
                CountZero++;
            }
        }
        System.out.println("the count of Positive numbers is "+CountPositive);
        System.out.println("the count of Negative numbers is "+CountNegavtive);
        System.out.println("the count of Zero numbers is "+CountZero);
    }
}
public class CountHowManyNumArePosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountNum cn = new CountNum();
        System.out.println("enter the range of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        cn.CountPosNegZeroInArray(sc, arr);
        sc.close();
    }
}
