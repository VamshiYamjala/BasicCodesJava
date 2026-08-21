import java.util.*;
class EvenOddSum{
    public void SumOfEvenOdd(int num){
        int remainder;
        int evenSum = 0;
        int oddSum = 0;
        while(num > 0){
            remainder = num % 10;
            if(remainder % 2 == 0){
                evenSum += remainder;
            }
            else{
                oddSum += remainder;
            }
            num /= 10;
        }
        System.out.println("even Sum is "+evenSum);
        System.out.println("odd sum  is "+oddSum);
    }
}
public class EvenOddNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddSum eos = new EvenOddSum();
        System.out.println("enter the number");
        int num = sc.nextInt();
        eos.SumOfEvenOdd(num);
        sc.close();
    }
}
