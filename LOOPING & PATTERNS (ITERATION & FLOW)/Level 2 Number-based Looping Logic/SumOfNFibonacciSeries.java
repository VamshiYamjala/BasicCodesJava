import java.util.*;
class SumOfFibonacci{
    public void FibonacciSumofN(int num){
        int sum = 0;
        if(num<=0){
            System.out.println("Please enter a positive integer greater than 0");
            return;
        }
        if(num >=1){
            // System.out.println(0);
        }
        if(num >=2){
            sum+=1;
            // System.out.println(1);
        }
        int firstNum = 0;
        int secondNum = 1;
        while(num>2){
            int nextNum = firstNum + secondNum;
            sum+=nextNum;
            firstNum = secondNum;
            secondNum = nextNum;
            num--;
        }
        System.out.println("the sum of n fibonacci series is "+sum);
    }
}
public class SumOfNFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfFibonacci sm = new SumOfFibonacci();
        System.out.println("enter the number to sum of them in fibonacci");
        int num = sc.nextInt();
        sm.FibonacciSumofN(num);
        sc.close();
    }
}
