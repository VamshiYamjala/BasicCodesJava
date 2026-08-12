import java.util.*;
class CheckNum{
    public void PositiveAndLessThen100(int num1 , int num2){
        if((num1 > 0 && num2 > 0) && ((num1 + num2) < 100)){
            System.out.println("Yes the both numbers are positive and the sum is less then 100 ");
        }
        else{
            System.out.println("no can't be done ");
        }
    }
}
public class SumAndNumberIsPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNum ck = new CheckNum();
        System.out.println("enter  2 numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ck.PositiveAndLessThen100(num1, num2);
        sc.close();
    }
}
