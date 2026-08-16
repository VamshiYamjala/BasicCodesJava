import java.util.*;
class SumOfnum{
    public void PrintSumOfNum(int num){
        int originalNum = num;
        int sum = 0;
        if(num == 0){
            System.out.println("the sum of the num is 0");
        }
        else{
            long tempNum = Math.abs((long)num);
            while(tempNum > 0){
                long remainder = tempNum % 10;
                sum += remainder;
                tempNum /=10;
            }
            System.out.println("the sum of the number "+originalNum+ " is "+sum);
        }
    }
}
public class SumOfDigitsInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfnum sn = new SumOfnum();
        System.out.println("enter the number to print sum of the number");
        int num = sc.nextInt();
        sn.PrintSumOfNum(num);
        sc.close();
    }
}
