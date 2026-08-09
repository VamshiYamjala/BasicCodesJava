import java.util.*;
class DivisibleBy5{
    public void CheckNum(int num){
        if(num % 5 == 0){
            System.out.println("the number is divisible by 5 :");
        }
        else{
            System.out.println("no the number is not divisible by 5: ");
        }
    }
}
public class CheckNumDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisibleBy5 dv = new DivisibleBy5();
        System.out.print("enter the number to check wheather it is divisible by 5: ");
        int num = sc.nextInt();
        dv.CheckNum(num);
        sc.close();
    }
}
